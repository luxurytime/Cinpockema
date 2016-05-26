package com.c9.cinpockema.model;

import java.util.Date;
import java.util.List;

/**
 * Created by marionette on 2016/5/24.
 */
public class Screening {
    private int id;
    private Date date;
    private Date startTime;
    private Date endTime;
    private List<Seat> seats;

    private int movieId;
    private int cinemaId;
    private int hallId;
    //???需要电影票id吗
    private int ticketId;

}
