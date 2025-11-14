package com.chubb.controller;
import com.chubb.request.*;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@GetMapping("/order")
	String getOrder()
	{
		return "hello there";
	}
	@PostMapping("/order")
	float saveOrder(@RequestBody @Valid Order order)
	{
		order.totalprice();
		return order.getPrice();
	}
	

}
