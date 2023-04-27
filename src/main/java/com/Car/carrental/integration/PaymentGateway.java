package com.Car.carrental.integration;

import org.springframework.stereotype.Component;

@Component
public class PaymentGateway {
    public void makePayment(String creditCardNo, String cvs, String expiryDate, double paymentAmount){
        System.out.println(creditCardNo +" "+expiryDate+" "+cvs+" "+ " "+ paymentAmount);
    }
}
