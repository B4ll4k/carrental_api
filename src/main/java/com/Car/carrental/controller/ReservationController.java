package com.Car.carrental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Car.carrental.domain.Reservation;
import com.Car.carrental.service.ReservationService;

@RestController
public class ReservationController {
    @Autowired
    ReservationService reservationService;

    @PostMapping("/reservations")
    public ResponseEntity<?> createUpdateReservation(@RequestBody Reservation reservation){
        reservationService.createUpdateReservation(reservation);

        //send message here to car fleet app
        
        return new ResponseEntity<Reservation>(reservation, HttpStatus.OK);
    }
}
