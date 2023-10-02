package com.example.casestudyfuramaspring.entity.contract;

import com.example.casestudyfuramaspring.entity.customer.Customer;
import com.example.casestudyfuramaspring.entity.employee.Employee;
import com.example.casestudyfuramaspring.entity.service.Service;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Contract {
    @Id
    @Column(columnDefinition = "varchar(25)")
    private String contract_id;
    private Date contract_start_date;
    private Date contract_end_date;
    private Double contract_deposit;
    private Double contract_total_money;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "service_id")
    private Service service;
    @OneToMany(mappedBy = "contract")
    private List<ContractDetail> contractDetails;

    public Contract() {
    }

    public Contract(String contract_id, Date contract_start_date, Date contract_end_date, Double contract_deposit, Double contract_total_money, Employee employee, Customer customer, Service service, List<ContractDetail> contractDetails) {
        this.contract_id = contract_id;
        this.contract_start_date = contract_start_date;
        this.contract_end_date = contract_end_date;
        this.contract_deposit = contract_deposit;
        this.contract_total_money = contract_total_money;
        this.employee = employee;
        this.customer = customer;
        this.service = service;
        this.contractDetails = contractDetails;
    }

    public String getContract_id() {
        return contract_id;
    }

    public void setContract_id(String contract_id) {
        this.contract_id = contract_id;
    }

    public Date getContract_start_date() {
        return contract_start_date;
    }

    public void setContract_start_date(Date contract_start_date) {
        this.contract_start_date = contract_start_date;
    }

    public Date getContract_end_date() {
        return contract_end_date;
    }

    public void setContract_end_date(Date contract_end_date) {
        this.contract_end_date = contract_end_date;
    }

    public Double getContract_deposit() {
        return contract_deposit;
    }

    public void setContract_deposit(Double contract_deposit) {
        this.contract_deposit = contract_deposit;
    }

    public Double getContract_total_money() {
        return contract_total_money;
    }

    public void setContract_total_money(Double contract_total_money) {
        this.contract_total_money = contract_total_money;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public List<ContractDetail> getContractDetails() {
        return contractDetails;
    }

    public void setContractDetails(List<ContractDetail> contractDetails) {
        this.contractDetails = contractDetails;
    }
}
