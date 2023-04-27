package com.Car.carrental.controller;

import com.Car.carrental.domain.Reservation;
import com.Car.carrental.service.CustomerDTO;
import com.Car.carrental.service.RentalHistories;

public class CustomerWithAllData {
    private CustomerDTO customer;
    private Reservation reservation;
    private RentalHistories rentalHistories;
    public CustomerDTO getCustomer() {
        return customer;
    }
    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }
    public Reservation getReservations() {
        return reservation;
    }
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
    public RentalHistories getRentalHistories() {
        return rentalHistories;
    }
    public void setRentalHistories(RentalHistories rentalHistories) {
        this.rentalHistories = rentalHistories;
    }

    
    
}
