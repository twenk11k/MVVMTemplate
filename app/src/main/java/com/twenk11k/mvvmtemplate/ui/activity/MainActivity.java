package com.twenk11k.mvvmtemplate.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.twenk11k.mvvmtemplate.R;
import com.twenk11k.mvvmtemplate.ViewModelProviderFactory;
import com.twenk11k.mvvmtemplate.data.model.FlickrRecent;
import com.twenk11k.mvvmtemplate.data.model.Photo;
import com.twenk11k.mvvmtemplate.databinding.ActivityMainBinding;
import com.twenk11k.mvvmtemplate.ui.adapter.MainAdapter;
import com.twenk11k.mvvmtemplate.ui.viewmodel.MainViewModel;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;


public class MainActivity extends BaseActivity<ActivityMainBinding, MainViewModel>  {

    @Inject
    ViewModelProviderFactory factory;

    private MainViewModel mainViewModel;

    private ActivityMainBinding activityMainBinding;
    private MainAdapter mainAdapter;


    private RecyclerView recyclerView;
    private ProgressBar progressBar;

    @Override
    public int getBindingVariable() {
        return 1;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public MainViewModel getViewModel() {
        mainViewModel = ViewModelProviders.of(this,factory).get(MainViewModel.class);
        return mainViewModel;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = getViewDataBinding();
        setupViews();
    }


    private void setupViews() {

        recyclerView = activityMainBinding.recyclerView;
        progressBar = activityMainBinding.progressBar;

        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        subscribeToLiveData();

    }


    private void subscribeToLiveData(){

        mainViewModel.getPhotos().observe(this, new Observer<FlickrRecent>() {
            @Override
            public void onChanged(FlickrRecent flickrRecent) {
                progressBar.setVisibility(View.GONE);
                Photo[] photoArr = flickrRecent.getPhotos().getPhoto();
                List<Photo> photoList = new ArrayList<>();
                for(int i=0; i<photoArr.length; i++){
                    photoList.add(photoArr[i]);
                }
                mainAdapter = new MainAdapter(getApplicationContext(),photoList);
                recyclerView.setAdapter(mainAdapter);
            }
        });
    }

}
