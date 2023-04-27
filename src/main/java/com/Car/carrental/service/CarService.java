package com.Car.carrental.service;

import java.util.Collection;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CarService {
    RestTemplate restTemplate = new RestTemplate();
    private String serverURL = "http://localhost:8080/cars";

    public Cars searchCarByBrand(String brand){
        return restTemplate.getForObject(serverURL + "/findByBrand/{brand}", Cars.class, brand);
    }

    public Cars searchCarByPrice(double price){
        return restTemplate.getForObject(serverURL + "/findByPrice/{price}", Cars.class, price);
    }

    public Cars searchCarByType(String type){
        return restTemplate.getForObject(serverURL + "/findByType/{type}", Cars.class, type);
    }
}
