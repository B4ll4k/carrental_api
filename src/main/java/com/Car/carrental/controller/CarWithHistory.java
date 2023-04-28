package com.Car.carrental.controller;


import com.Car.carrental.service.Car;
import com.Car.carrental.service.RentalHistories;

public class CarWithHistory {
    Car car;
    RentalHistories rentalHistories;
    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }
    public RentalHistories getRentalHistories() {
        return rentalHistories;
    }
    public void setRentalHistories(RentalHistories rentalHistories) {
        this.rentalHistories = rentalHistories;
    }
    
    
}
