package com.srikanth.springboot.controller.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.srikanth.springboot.domain.Customer;
import com.srikanth.springboot.service.CustomerService;

@RestController
@RequestMapping("/rest")
public class CustomerController {
	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

	@Autowired
	private CustomerService customerService;
	
	/**
	 * Retrieve all CUSTOMERS
	 */
	@GetMapping(path = "/customers", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getAllRequestTypes() {
		List<Customer> customers = customerService.getCustomers();
		String customersJson = new Gson().toJson(customers);
		return customersJson;
	}

}
