package com.Car.carrental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Car.carrental.service.CustomerDTO;
import com.Car.carrental.service.CustomerService;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping("/customers")
    ResponseEntity<?> createUpdateCustomer(@RequestBody CustomerDTO customerDTO){
        customerService.createUpdateCustomer(customerDTO);
        return new ResponseEntity<CustomerDTO>(customerDTO, HttpStatus.OK);
    }

    @DeleteMapping("/customers/{email}")
    ResponseEntity<?> removeCustomer(@PathVariable String email){
        customerService.removeCustomer(email);
        return new ResponseEntity<HttpStatus>(HttpStatus.OK);
    }

    @GetMapping("/customers")
    ResponseEntity<?> getAllCustomers(){
        return new ResponseEntity<Customers>(new Customers(customerService.getAllCustomers()), HttpStatus.OK);
    }

    @GetMapping("/customers/{email}")
    ResponseEntity<?> getByEmail(@PathVariable String email){
        return new ResponseEntity<CustomerDTO>(customerService.getByEmail(email), HttpStatus.OK);
    }

    @GetMapping("/customers/getByName/{name}")
    ResponseEntity<?> getByName(@PathVariable String name){
        return new ResponseEntity<Customers>(new Customers(customerService.getByName(name)), HttpStatus.OK);
    }
}
