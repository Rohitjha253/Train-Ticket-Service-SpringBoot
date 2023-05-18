package com.rohit.TrainBooking.dao;

import com.rohit.TrainBooking.model.TrainBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<TrainBook,Integer> {
}
