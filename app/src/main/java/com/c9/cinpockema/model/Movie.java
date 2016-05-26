package com.c9.cinpockema.model;

import java.util.Date;
import java.util.List;

/**
 * Created by marionette on 2016/5/24.
 */
public class Movie {
    private int id;
    private String name;
    private Date releaseDate;
    private double rating;
    private int duration;//时长，单位min
    private String type;//类型：如动作、爱情
    private String director;//演员
    private String leadingRole;//主演
    private String area;
    private String description;
    private List<MovieComment> comments;

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

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getLeadingRole() {
        return leadingRole;
    }

    public void setLeadingRole(String leadingRole) {
        this.leadingRole = leadingRole;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<MovieComment> getComments() {
        return comments;
    }

    public void setComments(List<MovieComment> comments) {
        this.comments = comments;
    }
}
