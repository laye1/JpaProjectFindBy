package com.saraya.JpaProjectFindBy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.saraya.JpaProjectFindBy.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
    //List<Customer> findByAddress(String address);
    
    @Query("select cus from Customer cus where cus.address = ?1")
    Customer findByAddress(String address);
    

}
