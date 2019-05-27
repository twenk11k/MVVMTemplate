package com.twenk11k.mvvmtemplate.data.api.repository;

import android.util.Log;
import androidx.lifecycle.MutableLiveData;
import com.twenk11k.mvvmtemplate.data.api.retrofit.ApiService;
import com.twenk11k.mvvmtemplate.data.model.FlickrRecent;
import com.twenk11k.mvvmtemplate.data.remote.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

import static com.twenk11k.mvvmtemplate.Constants.BASE_URL;

public class PhotoRepository {

    private MutableLiveData<FlickrRecent> mutableLiveData = new MutableLiveData<FlickrRecent>();

    public MutableLiveData<FlickrRecent> getMutableLiveData(){
        ApiService apiService = RetrofitClient.getApiService(BASE_URL);
        apiService.getPhotos()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<FlickrRecent>(){
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("onFailure",e.getMessage());
                    }

                    @Override
                    public void onNext(FlickrRecent flickrRecent) {
                        mutableLiveData.setValue(flickrRecent);
                    }
                });
        
        return mutableLiveData;
    }


}
