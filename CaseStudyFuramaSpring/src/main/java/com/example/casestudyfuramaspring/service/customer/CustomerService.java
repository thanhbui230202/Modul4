package com.example.casestudyfuramaspring.service.customer;

import com.example.casestudyfuramaspring.entity.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    void create(Customer customer);
    void update(Customer customer);
    void deleteById(String id);
    Customer findById(String id);
    Page<Customer> findAllCustomer(Pageable pageable);
}
