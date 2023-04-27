package com.Car.carrental;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Car.carrental.repository.CustomerRepository;

@SpringBootApplication
public class CarrentalApplication{
	@Autowired
	CustomerRepository customerRepository;
	public static void main(String[] args){
		SpringApplication.run(CarrentalApplication.class, args);
	}
}
