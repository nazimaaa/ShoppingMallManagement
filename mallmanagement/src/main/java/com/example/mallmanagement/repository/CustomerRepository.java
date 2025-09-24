package com.example.mallmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.mallmanagement.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    // Basic CRUD methods are available automatically
}
