package com.Car.carrental.service;

public class CustomerDTO {
    private long customerNumber;
    private String name;
    private String email;

    public CustomerDTO(long customerNumber, String name, String email) {
        this.customerNumber = customerNumber;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getCustomerNumber() {
        return customerNumber;
    }
    
}
