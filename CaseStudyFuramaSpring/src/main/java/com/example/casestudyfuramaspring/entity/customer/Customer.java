package com.example.casestudyfuramaspring.entity.customer;

import com.example.casestudyfuramaspring.entity.contract.Contract;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Customer {
    @Id
    @Column(columnDefinition = "varchar(25)",name = "customer_id")
    private String customerId;
    @ManyToOne
    @JoinColumn(name = "customer_type_id")
    private CustomerType customerType;
    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "customer_birthday")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date customerBirthday;
    @Column(name = "customer_gender")
    private boolean customerGender;
    @Column(name = "customer_id_card")
    private String customerIdCard;
    @Column(name = "customer_phone")
    private String customerPhone;
    @Column(name = "customer_email")
    private String customerEmail;
    @Column(name = "customer_address")
    private String customerAddress;
    @OneToMany(mappedBy = "customer")
    private List<Contract> contracts;
    public Customer() {
    }

    public Customer(String customerId, CustomerType customerType, String customerName, Date customerBirthday, boolean customerGender, String customerIdCard, String customerPhone, String customerEmail, String customerAddress, List<Contract> contracts) {
        this.customerId = customerId;
        this.customerType = customerType;
        this.customerName = customerName;
        this.customerBirthday = customerBirthday;
        this.customerGender = customerGender;
        this.customerIdCard = customerIdCard;
        this.customerPhone = customerPhone;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
        this.contracts = contracts;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customer_id) {
        this.customerId = customer_id;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customer_name) {
        this.customerName = customer_name;
    }

    public Date getCustomerBirthday() {
        return customerBirthday;
    }

    public void setCustomerBirthday(Date customer_birthday) {
        this.customerBirthday = customer_birthday;
    }

    public boolean isCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(boolean customer_gender) {
        this.customerGender = customer_gender;
    }

    public String getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(String customer_id_card) {
        this.customerIdCard = customer_id_card;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customer_phone) {
        this.customerPhone = customer_phone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customer_email) {
        this.customerEmail = customer_email;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customer_address) {
        this.customerAddress = customer_address;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }
}
