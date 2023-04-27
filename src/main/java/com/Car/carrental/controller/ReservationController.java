package com.Car.carrental.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Car.carrental.domain.RentalHistory;
import com.Car.carrental.domain.Reservation;
import com.Car.carrental.service.RentalHistories;
import com.Car.carrental.service.ReservationService;
import com.Car.carrental.service.Reservations;

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

    @GetMapping("/reservations")
    public ResponseEntity<?> getRervations(){
        Reservations rs = new Reservations();
        rs.setReservations(reservationService.getAllReservations());
        return new ResponseEntity<Reservations>(rs, HttpStatus.OK);
    }

    @GetMapping("/rentalHistories")
    public ResponseEntity<?> getRentalHistories(){
        RentalHistories rhs  = new RentalHistories();
        rhs.setRentalHistories(reservationService.getAllRentalHistories());
        return new ResponseEntity<RentalHistories>(rhs, HttpStatus.OK);
    }

    @PostMapping("/payAndReturnCar/{licensePlate}")
    public ResponseEntity<?> payAndReturnCar(@PathVariable String licensePlate, @RequestParam String creditCardNo, @RequestParam String cvs, @RequestParam String expiryDate){
        return new ResponseEntity<RentalHistory>(reservationService.payAndReturnCar(licensePlate, creditCardNo, cvs, expiryDate), HttpStatus.OK);
    }
}
