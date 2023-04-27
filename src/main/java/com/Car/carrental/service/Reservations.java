package com.Car.carrental.service;

import java.util.ArrayList;
import java.util.Collection;

import com.Car.carrental.domain.Reservation;

public class Reservations {
    private Collection<Reservation> reservations;

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    public Reservations() {
        reservations = new ArrayList<>();
    }


    public void setReservations(Collection<Reservation> reservations) {
        this.reservations = reservations;
    }
}
