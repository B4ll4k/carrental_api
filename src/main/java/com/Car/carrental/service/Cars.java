package com.Car.carrental.service;

import java.util.Collection;

public class Cars {
    private Collection<CarDTO> cars;

    public Collection<CarDTO> getCars() {
        return cars;
    }

    public Cars(Collection<CarDTO> cars) {
        this.cars = cars;
    }

}
