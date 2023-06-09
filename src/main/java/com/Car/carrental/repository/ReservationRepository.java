package com.Car.carrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Car.carrental.domain.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long>{
    Reservation findByLicensePlate(String licensePlate);
    Reservation findByCustomerNumber(long customerNumber);
}
