package com.twenk11k.mvvmtemplate.data.api.repository;

import android.util.Log;
import androidx.lifecycle.MutableLiveData;
import com.twenk11k.mvvmtemplate.data.api.retrofit.ApiService;
import com.twenk11k.mvvmtemplate.data.model.FlickrRecent;
import com.twenk11k.mvvmtemplate.data.remote.RetrofitClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.twenk11k.mvvmtemplate.Constants.BASE_URL;

public class PhotoRepository {

    private MutableLiveData<FlickrRecent> mutableLiveData = new MutableLiveData<FlickrRecent>();

    public MutableLiveData<FlickrRecent> getMutableLiveData(){
        ApiService apiService = RetrofitClient.getApiService(BASE_URL);
        Call<FlickrRecent> call = apiService.getPhotos();
        call.enqueue(new Callback<FlickrRecent>() {
            @Override
            public void onResponse(Call<FlickrRecent> call, Response<FlickrRecent> response) {
                FlickrRecent photos = response.body();
                if(photos!=null){
                    mutableLiveData.setValue(photos);
                }
            }

            @Override
            public void onFailure(Call<FlickrRecent> call, Throwable t) {
                Log.e("onFailure",t.getMessage());

            }
        });
        return mutableLiveData;
    }


}
