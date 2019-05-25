package com.twenk11k.mvvmtemplate.utils;

import static com.twenk11k.mvvmtemplate.Constants.PHOTO_SRC_PREFIX;
import static com.twenk11k.mvvmtemplate.Constants.PHOTO_SRC_STATIC;

public class StringUtils {


    public static String getPhotoUrl(String farmId, String serverId,String id, String secret) {
        String url = PHOTO_SRC_PREFIX+farmId+PHOTO_SRC_STATIC+serverId+"/"+id+"_"+secret+".jpg";
        return url;
    }

}
