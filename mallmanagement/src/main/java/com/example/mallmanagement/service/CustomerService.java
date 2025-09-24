package com.example.mallmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mallmanagement.entity.Customer;
import com.example.mallmanagement.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository crepo;

    // Insert customer
    public Customer addCustomer(Customer cus) {
        return crepo.save(cus);
    }

    // Get all customers
    public List<Customer> getCustomer() {
        return crepo.findAll();
    }

    // Delete customer
    public void deleteCus(int cid) {
        crepo.deleteById(cid);
    }

    // Update customer
    public Customer updateCustomer(Customer cus) {
        if(crepo.existsById(cus.getId())) {
            return crepo.save(cus); // save will update existing customer
        } else {
            throw new RuntimeException("Customer not found with id " + cus.getId());
        }
    }
}
