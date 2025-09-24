package com.example.mallmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.mallmanagement.entity.Customer;
import com.example.mallmanagement.service.CustomerService;

@RestController
public class CusController {

    @Autowired
    private CustomerService cser;

    // Add customer
    @PostMapping("/addcus")
    public Customer addcus(@RequestBody Customer cus) {
        return cser.addCustomer(cus);
    }

    // Get all customers
    @GetMapping("/getcus")
    public List<Customer> getcus(){
        return cser.getCustomer();
    }

    // Delete customer
    @DeleteMapping("/deleteCus/{cid}")
    public void deleteCus(@PathVariable int cid){
        cser.deleteCus(cid);
    }

    // Update customer
    @PutMapping("/updateCus/{cid}")
    public Customer updateCus(@PathVariable int cid, @RequestBody Customer cus) {
        cus.setId(cid); // ensure ID is set
        return cser.updateCustomer(cus);
    }
}
