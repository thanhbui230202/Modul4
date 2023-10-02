package com.example.casestudyfuramaspring.service.customer;

import com.example.casestudyfuramaspring.entity.customer.CustomerType;
import com.example.casestudyfuramaspring.repository.customer.CustomerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeServiceImpl implements CustomerTypeService{
    @Autowired
    private CustomerTypeRepository customerTypeRepository;

    @Override
    public CustomerType findById(int id) {
        return customerTypeRepository.findById(id).orElse(null);
    }

    @Override
    public List<CustomerType> findAllCustomerType() {
        return customerTypeRepository.findAll();
    }
}
