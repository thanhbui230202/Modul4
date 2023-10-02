package com.example.casestudyfuramaspring.repository.customer;

import com.example.casestudyfuramaspring.entity.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
