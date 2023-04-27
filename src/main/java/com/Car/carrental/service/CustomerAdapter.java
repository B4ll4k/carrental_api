package com.Car.carrental.service;

import java.util.ArrayList;
import java.util.List;

import com.Car.carrental.domain.Customer;

public class CustomerAdapter {
    public static Customer getCustomerFromCustomerDTO(CustomerDTO customerDTO) {
        return new Customer(customerDTO.getName(), customerDTO.getEmail());
    }

    public static CustomerDTO getCustomerDTOFromCustomer(Customer customer) {
        CustomerDTO c = new CustomerDTO(customer.getName(), customer.getEmail());
        c.setCustomerNumber(customer.getCustomerNumber());
        return c;
    }

    public static List<CustomerDTO> getCustomerDTOListFromCustomerList(List<Customer> customerList) {
        List<CustomerDTO> customerDTOs = new ArrayList<>();

        for (Customer customer : customerList) {
            CustomerDTO c = new CustomerDTO(customer.getName(), customer.getEmail());
            c.setCustomerNumber(customer.getCustomerNumber());
            customerDTOs.add(c);
        }

        return customerDTOs;
    }
}
