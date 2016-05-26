package com.c9.cinpockema.model;

import java.util.List;

/**
 * Created by marionette on 2016/5/25.
 */
public class Cinema {
    private int id;
    private String name;
    private String introduction;
    private double rating;
    private List<CinemaComment> comments;

    private String phoneNumber;
    private List<Hall> halls;
    private List<Movie> movies;
    private List<Screening> screenings;

    //定位？未完成
    private String location;
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
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
