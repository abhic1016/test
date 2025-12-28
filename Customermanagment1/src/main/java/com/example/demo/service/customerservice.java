package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.enitiy.customer;
import com.example.demo.repository.customerrepository;

@Service
public class customerservice {
	@Autowired
	customerrepository cr;
	public void addcustomer( customer c){
		cr.save(c);
	}

}
