package com.Car.carrental.service;

public class CustomerDTO {
    private long customerNumber;
    private String name;
    private String email;

    public CustomerDTO(String name, String email) {
        this.name = name;
        this.email = email;
    }

    

    public void setCustomerNumber(long customerNumber) {
        this.customerNumber = customerNumber;
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
