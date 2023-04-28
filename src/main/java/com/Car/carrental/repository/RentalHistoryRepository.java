package com.Car.carrental.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Car.carrental.domain.RentalHistory;

@Repository
public interface RentalHistoryRepository extends JpaRepository<RentalHistory, Long>{
    List<RentalHistory> findByCustomerNumber(long customerNumber);
    List<RentalHistory> findByLicensePlate(String licensePlate);
}
