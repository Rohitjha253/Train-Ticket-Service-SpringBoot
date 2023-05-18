package com.rohit.TrainBooking.controller;

import com.rohit.TrainBooking.model.TrainBook;
import com.rohit.TrainBooking.model.TrainDetails;
import com.rohit.TrainBooking.service.TrainBookServiceImpl;
import com.rohit.TrainBooking.service.TrainServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/noauth")
public class UserController {

    @Autowired
    private TrainBookServiceImpl trainBookService;

    @PostMapping("/ticket")
    public String bookTicket(@RequestBody() TrainBook book){
        return trainBookService.bookticket(book);
    }

    @GetMapping("/ticket")
    public List<TrainBook> getTicket(){
        return trainBookService.showMyticket();
    }

    @DeleteMapping("/ticket")
    public String cancelTicket(@RequestParam("id") Integer id){
        return trainBookService.cancelTicket(id);
    }


}
