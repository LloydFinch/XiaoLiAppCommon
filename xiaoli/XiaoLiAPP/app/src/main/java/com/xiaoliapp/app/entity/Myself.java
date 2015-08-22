package com.xiaoliapp.app.entity;

/**
 * Created by Administrator on 2015/8/14.
 * Project:XiaoLiApp
 * User:king
 * Date:2015/8/14
 * Time:20:06
 */
public class Myself {
    private int imageId;
    private String name;

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Myself{" +
                "imageId=" + imageId +
                ", name='" + name + '\'' +
                '}';
    }
}
