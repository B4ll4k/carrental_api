package com.Car.carrental.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class RentalHistory {
    @Id
    @GeneratedValue
    private long Id;

    private long customerNumber;
    private String licensePlate;
    private String startDate;
    private String endDate;
    private double payment;
    
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

    public double getPayment(){
        return payment;
    }
    
    public RentalHistory() {
    }
    public RentalHistory(long customerNumber, String licensePlate, String startDate, String endDate, double payment) {
        this.customerNumber = customerNumber;
        this.licensePlate = licensePlate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.payment = payment;
    }

    
}
