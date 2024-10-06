package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.entity.Customer;
import com.nt.service.CustomerService;

import jakarta.annotation.PostConstruct;

@Controller
public class Controller1 {

	@Autowired
	CustomerService customerService;

	public Controller1() {
		System.out.println("Controller.Controller():0-parm contractor");
	}

	//Customer  cus;
	@PostConstruct
	public void getcustomer() {
		Customer  cus=customerService.getCustomar();
		//(or)
		//System.out.println(customerService.getCustomar());
		System.out.println("getCustomer"+cus);
	}
}
