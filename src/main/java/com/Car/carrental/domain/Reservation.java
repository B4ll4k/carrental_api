package com.Car.carrental.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Reservation {
    @Id
    @GeneratedValue
    private long Id;

    private long customerNumber;
    private String licensePlate;
    private LocalDate startDate;
    private LocalDate endDate;
    
    public long getCustomerNumber() {
        return customerNumber;
    }
    public String getLicensePlate() {
        return licensePlate;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }
    
    public Reservation() {
    }

    public Reservation(long customerNumber, String licensePlate, LocalDate startDate, LocalDate endDate) {
        this.customerNumber = customerNumber;
        this.licensePlate = licensePlate;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
