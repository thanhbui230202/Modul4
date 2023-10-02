package com.example.casestudyfuramaspring.service.customer;

import com.example.casestudyfuramaspring.entity.customer.CustomerType;

import java.util.List;

public interface CustomerTypeService {
    CustomerType findById(int id);
    List<CustomerType> findAllCustomerType();
}
