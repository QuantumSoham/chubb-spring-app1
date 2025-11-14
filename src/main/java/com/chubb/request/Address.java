package com.chubb.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Address {

    @NotBlank(message = "house cannot be empty")
    private String house;

    @Min(value = 100000, message = "pin must be at least 6 digits")
    private int pin;

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
