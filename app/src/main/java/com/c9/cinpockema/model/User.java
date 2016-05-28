package com.c9.cinpockema.model;

import java.util.List;

/**
 * Created by marionette on 2016/5/24.
 */
public class User {
    private int id;
    private String userName;
    private String password;
    private String nickName;//昵称
    private String avatarUrl;
    private List<Order> orderList;
    private List<MovieComment> movieComments;
    private List<Movie> collections;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public List<Movie> getCollections() {
        return collections;
    }

    public void setCollections(List<Movie> collections) {
        this.collections = collections;
    }

    public List<MovieComment> getMovieComments() {
        return movieComments;
    }

    public void setMovieComments(List<MovieComment> movieComments) {
        this.movieComments = movieComments;
    }
}
