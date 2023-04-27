package com.Car.carrental;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "myapp.rental")
public class CarRentalProperties {
    private String serverURL;
    private int maxReserveAmount;
    public String getServerURL() {
        return serverURL;
    }
    public int getMaxReserveAmount() {
        return maxReserveAmount;
    }
    public void setServerURL(String serverURL) {
        this.serverURL = serverURL;
    }
    public void setMaxReserveAmount(int maxReserveAmount) {
        this.maxReserveAmount = maxReserveAmount;
    }

    
}
