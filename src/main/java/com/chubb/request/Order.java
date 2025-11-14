package com.chubb.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;

public class Order {

    private String item;
    private float price;

    @Min(1)
    private int qty;

    @Valid   // IMPORTANT: this activates validation for nested objects
    private Address address;

    public void totalprice() {
        price = qty * price;
    }

    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }

    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
}
