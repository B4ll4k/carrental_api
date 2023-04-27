package com.Car.carrental.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.Car.carrental.domain.RentalHistory;
import com.Car.carrental.domain.Reservation;
import com.Car.carrental.repository.RentalHistoryRepository;
import com.Car.carrental.repository.ReservationRepository;

@Service
@EnableJms
public class ReservationService {
    @Autowired
    ReservationRepository reservationRepository;
    @Autowired
    RentalHistoryRepository rentalHistoryRepository;
    @Autowired
    JmsTemplate jmsTemplate;

    public void createUpdateReservation(Reservation reservation) {
        reservationRepository.save(reservation);
        jmsTemplate.convertAndSend("carfleet", reservation.getLicensePlate());
    }
    @Transactional
    public RentalHistory returnCar(String licensePlate){
        Reservation r = reservationRepository.findByLicensePlate(licensePlate);
        RentalHistory th = new RentalHistory(r.getCustomerNumber(), licensePlate, r.getStartDate(), r.getEndDate());
        rentalHistoryRepository.save(th);
        reservationRepository.delete(r);
        return th;
    }

    public Reservation pickUp(String licensePlate){
        Reservation r = reservationRepository.findByLicensePlate(licensePlate);
        r.setPickedUp(true);
        reservationRepository.save(r);
        return r;
    }

    public List<Reservation> getAllReservations(){
        return reservationRepository.findAll();
    }

    public List<RentalHistory> getAllRentalHistories(){
        return rentalHistoryRepository.findAll();
    }
}
