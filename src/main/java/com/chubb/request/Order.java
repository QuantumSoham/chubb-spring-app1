package com.chubb.request;

import jakarta.validation.constraints.Min;

public class Order {

	private String item;
	private float price;
	private int qty;
	
	public void totalprice()
	{
		price=qty*price;
	}
	@Min(value=1)
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
	
}
