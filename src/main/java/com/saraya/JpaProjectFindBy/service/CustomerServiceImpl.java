package com.saraya.JpaProjectFindBy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saraya.JpaProjectFindBy.dto.CustomerDTO;
import com.saraya.JpaProjectFindBy.entity.Customer;
import com.saraya.JpaProjectFindBy.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService{
	
      @Autowired
      private CustomerRepository  repository; 
      
    public void insertCustomer(CustomerDTO customer) {
        repository.saveAndFlush(CustomerDTO.prepareCustomerEntity(customer));
    
    }
 
    @Override
    public Customer getCustomer(String address) {
        
        return repository.findByAddress(address);
    }
    

    
    
}

	


