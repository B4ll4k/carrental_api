package com.Car.carrental.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Car.carrental.repository.CustomerRepository;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public void createUpdateCustomer(CustomerDTO customerDTO){
        customerRepository.save(CustomerAdapter.getCustomerFromCustomerDTO(customerDTO));
    }

    public void removeCustomer(String email){
        customerRepository.removeByEmail(email);
    }

    public List<CustomerDTO> getAllCustomers(){
        return CustomerAdapter.getCustomerDTOListFromCustomerList(customerRepository.findAll());
    }

    public CustomerDTO getByEmail(String email){
        return CustomerAdapter.getCustomerDTOFromCustomer(customerRepository.findByEmail(email));
    }

    public List<CustomerDTO> getByName(String name){
        return CustomerAdapter.getCustomerDTOListFromCustomerList(customerRepository.findByName(name));
    }
}
