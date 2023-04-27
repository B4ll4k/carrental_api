package com.Car.carrental.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Car.carrental.CarRentalProperties;

@Service
public class CarService {
    @Autowired
    CarRentalProperties carRentalProperties;
    RestTemplate restTemplate = new RestTemplate();

    public Cars searchCarByBrand(String brand){
        return restTemplate.getForObject(carRentalProperties.getServerURL() + "/findByBrand/{brand}", Cars.class, brand);
    }

    public Cars searchCarByPrice(double price){
        return restTemplate.getForObject(carRentalProperties.getServerURL() + "/findByPrice/{price}", Cars.class, price);
    }

    public Cars searchCarByType(String type){
        return restTemplate.getForObject(carRentalProperties.getServerURL() + "/findByType/{type}", Cars.class, type);
    }
}
