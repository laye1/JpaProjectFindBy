package com.saraya.JpaProjectFindBy.service;

import com.saraya.JpaProjectFindBy.dto.CustomerDTO;
import com.saraya.JpaProjectFindBy.entity.Customer;

public interface CustomerService {
	
	public void insertCustomer(CustomerDTO Customer) ;
	 
    public Customer getCustomer(String address);


}
