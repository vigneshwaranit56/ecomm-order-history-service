package com.ecom.order.history.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orderhistorys")
public class OrderHistoryController {
	
	@GetMapping
	public String testController() {
		return "hello order history Service";
	}

}
