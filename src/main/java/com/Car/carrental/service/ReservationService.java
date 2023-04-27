package com.Car.carrental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Car.carrental.domain.Reservation;
import com.Car.carrental.repository.ReservationRepository;

@Service
public class ReservationService {
    @Autowired
    ReservationRepository reservationRepository;
    public void createUpdateReservation(Reservation reservation){
        reservationRepository.save(reservation);
    }
}
