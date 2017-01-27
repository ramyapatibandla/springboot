package com.pragati.springboot.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pragati.springboot.domain.Customer;
import com.pragati.springboot.repository.CustomerRepository;

@Service
public class CustomerService {
	
	private static final Logger logger = LoggerFactory.getLogger(CustomerService.class);
	
	@Autowired
	private CustomerRepository customerRepository;

	
	public List<Customer> getCustomers() {
		List<Customer> customers = customerRepository.findAll();
		logger.info("get all customers : " + customers);
		return customers;
	}

}
