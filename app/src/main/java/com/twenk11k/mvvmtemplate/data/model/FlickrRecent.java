package com.twenk11k.mvvmtemplate.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FlickrRecent {

    @SerializedName("photos")
    @Expose
    private Photos photos;
    @SerializedName("stat")
    @Expose
    private String stat;

    public Photos getPhotos(){
        return photos;
    }

    public String getStat(){
        return stat;
    }

}
