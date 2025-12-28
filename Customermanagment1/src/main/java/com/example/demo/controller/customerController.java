package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.enitiy.customer;
import com.example.demo.service.customerservice;


@RestController
public class customerController {
	@Autowired
	customerservice cs;
@PostMapping("addCustomer")
	 String addcustomer(@RequestBody customer c) {
	 cs.addcustomer(c);
		 return "customer added";
		
	 }
	 
}
