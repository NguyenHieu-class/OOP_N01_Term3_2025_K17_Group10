package com.project.CarRental.model;

import java.util.Date;
import java.util.List;

public class Booking {
    private int idBooking;
    private String phone;
    private String address;

    private int statusBill;
    private Date dateStart;
    private Date dateEnd;
    private int billTotal;

    private Date createDate;
    private Date updateDate;

    private Car car;
    private User user;
}
