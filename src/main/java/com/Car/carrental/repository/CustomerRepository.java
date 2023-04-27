package com.Car.carrental.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Car.carrental.domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
    Customer findByCustomerNumber(String customerNumber);
    Customer findByEmail(String email);
    List<Customer> findByName(String name);
}
