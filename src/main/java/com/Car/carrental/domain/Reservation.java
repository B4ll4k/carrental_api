package com.Car.carrental.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reservation {
    @Id
    @GeneratedValue
    private long Id;

    private long customerNumber;
    private String licensePlate;
    private String startDate;
    private String endDate;
    private boolean pickedUp;
    
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
    
    public boolean isPickedUp() {
        return pickedUp;
    }

    public void setPickedUp(boolean pickedUp) {
        this.pickedUp = pickedUp;
    }
    public Reservation() {
    }

    public Reservation(long customerNumber, String licensePlate, String startDate, String endDate, boolean pickedUp) {
        this.customerNumber = customerNumber;
        this.licensePlate = licensePlate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pickedUp = pickedUp;
    }
}
