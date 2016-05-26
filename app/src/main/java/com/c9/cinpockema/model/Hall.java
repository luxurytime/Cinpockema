package com.c9.cinpockema.model;

/**
 * Created by marionette on 2016/5/24.
 */
public class Hall {
    private int id;
    private int cinemaId;
    private String name;
    private String description;//影厅描述（2D、3D、大屏等）

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(int cinemaId) {
        this.cinemaId = cinemaId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
