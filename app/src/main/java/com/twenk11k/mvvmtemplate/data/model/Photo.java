package com.twenk11k.mvvmtemplate.data.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Photo
{
    @SerializedName("owner")
    @Expose
    private String owner;
    @SerializedName("server")
    @Expose
    private String server;
    @SerializedName("ispublic")
    @Expose
    private String ispublic;
    @SerializedName("isfriend")
    @Expose
    private String isfriend;
    @SerializedName("farm")
    @Expose
    private String farm;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("secret")
    @Expose
    private String secret;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("isfamily")
    @Expose
    private String isfamily;

    public String getOwner ()
    {
        return owner;
    }

    public void setOwner (String owner)
    {
        this.owner = owner;
    }

    public String getServer ()
    {
        return server;
    }

    public void setServer (String server)
    {
        this.server = server;
    }

    public String getIspublic ()
    {
        return ispublic;
    }

    public void setIspublic (String ispublic)
    {
        this.ispublic = ispublic;
    }

    public String getIsfriend ()
    {
        return isfriend;
    }

    public void setIsfriend (String isfriend)
    {
        this.isfriend = isfriend;
    }

    public String getFarm ()
    {
        return farm;
    }

    public void setFarm (String farm)
    {
        this.farm = farm;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getSecret ()
    {
        return secret;
    }

    public void setSecret (String secret)
    {
        this.secret = secret;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getIsfamily ()
    {
        return isfamily;
    }

    public void setIsfamily (String isfamily)
    {
        this.isfamily = isfamily;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [owner = "+owner+", server = "+server+", ispublic = "+ispublic+", isfriend = "+isfriend+", farm = "+farm+", id = "+id+", secret = "+secret+", title = "+title+", isfamily = "+isfamily+"]";
    }
}