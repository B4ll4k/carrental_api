package com.Car.carrental.service;

import java.util.ArrayList;
import java.util.Collection;

import com.Car.carrental.domain.RentalHistory;

public class RentalHistories {
    private Collection<RentalHistory> rentalHistories;

    public Collection<RentalHistory> getRentalHistories() {
        return rentalHistories;
    }

    public RentalHistories() {
        rentalHistories = new ArrayList<>();
    }


    public void setRentalHistories(Collection<RentalHistory> rentalHistories) {
        this.rentalHistories = rentalHistories;
    }
}
