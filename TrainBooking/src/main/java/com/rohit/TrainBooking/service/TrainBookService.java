package com.rohit.TrainBooking.service;

import com.rohit.TrainBooking.model.TrainBook;

import java.util.List;

public interface TrainBookService {

    String bookticket(TrainBook book);

    List<TrainBook> showMyticket();

    String cancelTicket(Integer id);

}
