package com.Car.carrental.domain;

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
    private String startDate;
    private String endDate;
    
    public long getCustomerNumber() {
        return customerNumber;
    }
    public String getLicensePlate() {
        return licensePlate;
    }
    public String getStartDate() {
        return startDate;
    }
    public String getEndDate() {
        return endDate;
    }
    
    public Reservation() {
    }

    public Reservation(long customerNumber, String licensePlate, String startDate, String endDate) {
        this.customerNumber = customerNumber;
        this.licensePlate = licensePlate;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
