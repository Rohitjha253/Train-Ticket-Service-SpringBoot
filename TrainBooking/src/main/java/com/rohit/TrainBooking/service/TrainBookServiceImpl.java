package com.rohit.TrainBooking.service;

import com.rohit.TrainBooking.dao.UserDao;
import com.rohit.TrainBooking.model.TrainBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TrainBookServiceImpl implements TrainBookService{

    @Autowired
    private UserDao userDao;

    @Override
    public String bookticket(TrainBook book) {
        userDao.save(book);
        return "Ticket Booked";
    }

    @Override
    public List<TrainBook> showMyticket() {
        return userDao.findAll();
    }

    @Override
    public String cancelTicket(Integer id) {
        userDao.deleteById(id);
        return "Ticket cancelled";
    }
}
