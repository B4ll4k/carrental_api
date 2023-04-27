package com.Car.carrental.service;

public class CarDTO {
    private  String licensePlate;
    private String type;
    private String brand;
    private double price;
    private boolean isAvailable;

    

    public String getLicensePlate() {
        return licensePlate;
    }



    public String getType() {
        return type;
    }



    public String getBrand() {
        return brand;
    }



    public double getprice() {
        return price;
    }



    public boolean isAvailable() {
        return isAvailable;
    }




    public CarDTO(String licensePlate, String type, String brand, double price, boolean isAvailable) {
        this.licensePlate = licensePlate;
        this.type = type;
        this.brand = brand;
        this.price = price;
        this.isAvailable = isAvailable;
    }
    

}