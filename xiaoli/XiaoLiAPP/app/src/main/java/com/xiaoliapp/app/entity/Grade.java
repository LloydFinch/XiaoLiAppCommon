package com.xiaoliapp.app.entity;

/**
 * Created by Administrator on 2015/8/19.
 * Project:XiaoLiApp
 * User:king
 * Date:2015/8/19
 * Time:16:05
 */
public class Grade {
    private int image;
    private String date;
    private String nick;
    private String zan;
    private String cai;
    private String score;

    public String getCai() {
        return cai;
    }

    public void setCai(String cai) {
        this.cai = cai;
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

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getZan() {
        return zan;
    }

    public void setZan(String zan) {
        this.zan = zan;
    }
}
