package com.twenk11k.mvvmtemplate.data.api.retrofit;

import com.twenk11k.mvvmtemplate.data.model.FlickrRecent;

import retrofit2.Call;
import retrofit2.http.GET;
import static com.twenk11k.mvvmtemplate.Constants.API_KEY;
import static com.twenk11k.mvvmtemplate.Constants.FORMAT_JSON;
import static com.twenk11k.mvvmtemplate.Constants.METHOD_PHOTOS_GETRECENT;

public interface ApiService {


    @GET("?method="+METHOD_PHOTOS_GETRECENT+"&api_key="+API_KEY+FORMAT_JSON)
    Call<FlickrRecent> getPhotos();


}
