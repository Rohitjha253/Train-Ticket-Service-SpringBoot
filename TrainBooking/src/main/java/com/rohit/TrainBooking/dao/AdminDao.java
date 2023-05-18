package com.rohit.TrainBooking.dao;

import com.rohit.TrainBooking.model.TrainDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminDao extends JpaRepository<TrainDetails,Integer> {
}
