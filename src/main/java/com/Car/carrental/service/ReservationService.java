package com.Car.carrental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.Car.carrental.domain.Reservation;
import com.Car.carrental.repository.ReservationRepository;

@Service
@EnableJms
public class ReservationService {
    @Autowired
    ReservationRepository reservationRepository;
    @Autowired
    JmsTemplate jmsTemplate;

    public void createUpdateReservation(Reservation reservation) {
        reservationRepository.save(reservation);
        jmsTemplate.convertAndSend("carfleet", reservation.getLicensePlate());
    }

}
