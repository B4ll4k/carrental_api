package com.Car.carrental.service;

public class Car {
    private  String licensePlate;
    private String type;
    private String brand;
    private double price;
    private boolean available;

    

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



    public boolean getAvailable() {
        return available;
    }

    


    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }



    public void setType(String type) {
        this.type = type;
    }



    public void setBrand(String brand) {
        this.brand = brand;
    }



    public void setPrice(double price) {
        this.price = price;
    }



    public void setAvailable(boolean available) {
        this.available = available;
    }



    public Car() {
    }



    public Car(String licensePlate, String type, String brand, double price, boolean available) {
        this.licensePlate = licensePlate;
        this.type = type;
        this.brand = brand;
        this.price = price;
        this.available = available;
    }
    

}