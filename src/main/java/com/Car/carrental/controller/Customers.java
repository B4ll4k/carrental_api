package com.Car.carrental.controller;

import java.util.Collection;

import com.Car.carrental.service.CustomerDTO;

public class Customers {
    private Collection<CustomerDTO> customers;

    public Collection<CustomerDTO> getCustomers() {
        return customers;
    }

    public Customers(Collection<CustomerDTO> customers) {
        this.customers = customers;
    } 
}
