package com.c9.cinpockema.model;

import java.util.List;

/**
 * Created by marionette on 2016/5/25.
 */
public class Cinema {
    private int id;
    private String name;//电影院名字
    private String introduction;//影院介绍
    private double rating;//评分，暂时忽略
    private List<CinemaComment> comments;//影院评论
    private String phoneNumber;//影院电话
    private List<Hall> halls;//影厅
    private List<Movie> movies;//播放的电影列表
    private List<Screening> screenings;//场次
    //影院位置信息
    private String address;//地址
    private int cityId;//所属城市ID
    private double lat;//纬度
    private double lng;//经度


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public List<CinemaComment> getComments() {
        return comments;
    }

    public void setComments(List<CinemaComment> comments) {
        this.comments = comments;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Hall> getHalls() {
        return halls;
    }

    public void setHalls(List<Hall> halls) {
        this.halls = halls;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Screening> getScreenings() {
        return screenings;
    }

    public void setScreenings(List<Screening> screenings) {
        this.screenings = screenings;
    }
}
