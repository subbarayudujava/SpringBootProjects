package com.nt.service;

import org.springframework.stereotype.Service;

import com.nt.entity.Customer;

@Service
public class CustomerService {
       public CustomerService() {
    	   System.out.println("CustomerService.CustomerService()");
       }
       public Customer getCustomar() {
    	   return new Customer("Subbarayudu", "Hyderabad");
    	   }
}
