package com.zomore.service;

import com.zomore.domain.Reservation;

import java.util.Date;
import java.util.List;

//顾客预约
public interface ReservationService {

    //根据时间段查找顾客预约
    List<Reservation> select(String startime,String endtime);
}
