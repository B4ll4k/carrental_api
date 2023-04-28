package com.Car.carrental;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.Car.carrental.service.CarService;


@SpringBootApplication
@EnableScheduling
@EnableConfigurationProperties(CarRentalProperties.class)
public class CarrentalApplication {
	@Autowired
	CarService carService;

	public static void main(String[] args) {
		SpringApplication.run(CarrentalApplication.class, args);
	}

	@Scheduled(fixedRate = 20000)
	public void scheduledMethod(){
		carService.getAllCars().stream().forEach(System.out::println);
	}
}
