package com.xiaoliapp.app.entity;

/**
 * Created by Administrator on 2015/8/18.
 * Project:XiaoLiApp
 * User:king
 * Date:2015/8/18
 * Time:9:53
 */
public class Card {
    private int card_image;
    private String card_title;
    private String card_rule;
    private String card_limit;
    private String date;

    public int getCard_image() {
        return card_image;
    }

    public Card(int card_image, String card_limit, String card_rule, String card_title, String date) {
        this.card_image = card_image;
        this.card_limit = card_limit;
        this.card_rule = card_rule;
        this.card_title = card_title;
        this.date = date;
    }

    public void setCard_image(int card_image) {
        this.card_image = card_image;
    }

    public String getCard_limit() {
        return card_limit;
    }

    public void setCard_limit(String card_limit) {
        this.card_limit = card_limit;
    }

    public String getCard_rule() {
        return card_rule;
    }

    public void setCard_rule(String card_rule) {
        this.card_rule = card_rule;
    }

    public String getCard_title() {
        return card_title;
    }

    public void setCard_title(String card_title) {
        this.card_title = card_title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
