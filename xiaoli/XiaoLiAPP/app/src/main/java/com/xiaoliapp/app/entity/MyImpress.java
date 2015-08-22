package com.xiaoliapp.app.entity;

/**
 * Created by Administrator on 2015/8/20.
 * Project:XiaoLiApp
 * User:king
 * Date:2015/8/20
 * Time:14:52
 */
public class MyImpress {
    private int image;
    private String nick;
    private String impressWord;
    private String date;
    private String zan;
    private String cai;

    public String getCai() {
        return cai;
    }

    public void setCai(String cai) {
        this.cai = cai;
    }

    public String getZan() {
        return zan;
    }

    public void setZan(String zan) {
        this.zan = zan;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getImpressWord() {
        return impressWord;
    }

    public void setImpressWord(String impressWord) {
        this.impressWord = impressWord;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
}

