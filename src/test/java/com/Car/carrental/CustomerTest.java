package com.Car.carrental;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.Car.carrental.domain.Customer;

public class CustomerTest {
    
    private Customer customer;

    @BeforeEach
    public void setUp() {
        customer = new Customer("John Smith", "john.smith@example.com");
    }

    @Test
    public void testGetName() {
        Assertions.assertEquals("John Smith", customer.getName());
    }

    @Test
    public void testGetEmail() {
        Assertions.assertEquals("john.smith@example.com", customer.getEmail());
    }

    @Test
    public void testGetCustomerNumber() {
        Assertions.assertEquals(0, customer.getCustomerNumber());
    }
}
