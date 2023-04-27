package com.Car.carrental.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Car.carrental.domain.RentalHistory;
import com.Car.carrental.domain.Reservation;
import com.Car.carrental.service.ReservationService;

@RestController
public class ReservationController {
    @Autowired
    ReservationService reservationService;

    @PostMapping("/reservations")
    public ResponseEntity<?> createUpdateReservation(@RequestBody Reservation reservation){
        reservationService.createUpdateReservation(reservation);
        
        return new ResponseEntity<Reservation>(reservation, HttpStatus.OK);
    }

    @PostMapping("/pickedUpCar/{licensePlate}")
    public ResponseEntity<?> pickedUp(@PathVariable String licensePlate){
        return new ResponseEntity<Reservation>(reservationService.pickUp(licensePlate), HttpStatus.OK);
    }

    @PostMapping("/returnCar/{licensePlate}")
    public ResponseEntity<?> returnCar(@PathVariable String licensePlate){
        return new ResponseEntity<RentalHistory>(reservationService.returnCar(licensePlate), HttpStatus.OK);
    }
}
