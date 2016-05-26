package com.c9.cinpockema.model;

import java.util.Date;
import java.util.List;

/**
 * Created by marionette on 2016/5/24.
 */
public class Order {
    private int id;
    //订单状态，枚举类型
//    private Enum<> state;
    private String exchangeTicketCode;
    private Date creatTime;
    private Date payTime;
    private String userName;
    private List<Ticket> tickets;
    private double total;

}
