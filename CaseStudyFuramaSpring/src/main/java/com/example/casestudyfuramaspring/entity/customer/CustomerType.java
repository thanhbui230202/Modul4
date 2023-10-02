package com.example.casestudyfuramaspring.entity.customer;

import javax.persistence.*;
import java.util.List;

@Entity
public class CustomerType {
    @Id
    @GeneratedValue
    @Column(name = "customer_type_id")
    private int customerTypeId;
    @Column(name = "customer_type_name")
    private String customerTypeName;
    @OneToMany(mappedBy = "customerType")
    private List<Customer> customers;

    public CustomerType() {
    }

    public CustomerType(int customerTypeId, String customerTypeName, List<Customer> customers) {
        this.customerTypeId = customerTypeId;
        this.customerTypeName = customerTypeName;
        this.customers = customers;
    }

    public int getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(int customer_type_id) {
        this.customerTypeId = customer_type_id;
    }

    public String getCustomerTypeName() {
        return customerTypeName;
    }

    public void setCustomerTypeName(String customer_type_name) {
        this.customerTypeName = customer_type_name;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
