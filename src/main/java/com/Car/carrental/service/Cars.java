package com.Car.carrental.service;

import java.util.ArrayList;
import java.util.Collection;

public class Cars {
    private Collection<Car> cars;

    public Collection<Car> getCars() {
        return cars;
    }

    

    public Cars() {
        cars = new ArrayList<>();
    }


    public void setCars(Collection<Car> cars) {
        this.cars = cars;
    }

}
