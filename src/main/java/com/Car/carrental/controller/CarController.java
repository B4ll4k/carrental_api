package com.Car.carrental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Car.carrental.service.CarService;
import com.Car.carrental.service.Cars;


@RestController
public class CarController {
    @Autowired
    CarService carService;

    @GetMapping("/carsByType/{type}")
    public ResponseEntity<?> getCarByType(@PathVariable String type){
        return new ResponseEntity<Cars>(carService.searchCarByType(type), HttpStatus.OK);
    }

    @GetMapping("/carsByBrand/{brand}")
    public ResponseEntity<?> getCarByBrand(@PathVariable String brand){
        return new ResponseEntity<Cars>(carService.searchCarByBrand(brand), HttpStatus.OK);
    }

    @GetMapping("/carsByPrice/{price}")
    public ResponseEntity<?> getCarByPrice(@PathVariable double price){
        return new ResponseEntity<Cars>(carService.searchCarByPrice(price), HttpStatus.OK);
    }
}
