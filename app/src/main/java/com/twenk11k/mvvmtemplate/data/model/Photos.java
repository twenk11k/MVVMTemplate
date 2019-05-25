package com.twenk11k.mvvmtemplate.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Photos
{
    @SerializedName("perpage")
    @Expose
    private String perpage;
    @SerializedName("total")
    @Expose
    private String total;
    @SerializedName("pages")
    @Expose
    private String pages;
    @SerializedName("photo")
    @Expose
    private Photo[] photo;
    @SerializedName("page")
    @Expose
    private String page;

    public String getPerpage ()
    {
        return perpage;
    }

    public void setPerpage (String perpage)
    {
        this.perpage = perpage;
    }

    public String getTotal ()
    {
        return total;
    }

    public void setTotal (String total)
    {
        this.total = total;
    }

    public String getPages ()
    {
        return pages;
    }

    public void setPages (String pages)
    {
        this.pages = pages;
    }

    public Photo[] getPhoto ()
    {
        return photo;
    }

    public void setPhoto (Photo[] photo)
    {
        this.photo = photo;
    }

    public String getPage ()
    {
        return page;
    }

    public void setPage (String page)
    {
        this.page = page;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [perpage = "+perpage+", total = "+total+", pages = "+pages+", photo = "+photo+", page = "+page+"]";
    }
}