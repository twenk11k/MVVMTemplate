package com.twenk11k.mvvmtemplate.ui.viewmodel;

import androidx.lifecycle.LiveData;
import com.twenk11k.mvvmtemplate.data.api.repository.PhotoRepository;
import com.twenk11k.mvvmtemplate.data.model.FlickrRecent;
import com.twenk11k.mvvmtemplate.utils.rx.SchedulerProvider;


public class MainViewModel extends BaseViewModel {

    private PhotoRepository photoRepository;

    public MainViewModel(SchedulerProvider schedulerProvider) {
        super(schedulerProvider);
        photoRepository = new PhotoRepository();
    }

    public LiveData<FlickrRecent> getPhotos() {
        return photoRepository.getMutableLiveData();
    }

}
