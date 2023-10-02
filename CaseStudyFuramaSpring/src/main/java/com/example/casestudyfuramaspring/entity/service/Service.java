package com.example.casestudyfuramaspring.entity.service;

import com.example.casestudyfuramaspring.entity.contract.Contract;

import javax.persistence.*;
import java.util.List;

@Entity
public class Service {
    @Id
    @Column(columnDefinition = "varchar(25)")
    private String service_id;
    private String service_name;
    private int service_area;
    private Double service_cost;
    private int service_max_people;
    @ManyToOne
    @JoinColumn(name = "rent_type_id")
    private RentType rentType;
    @ManyToOne
    @JoinColumn(name = "service_type_id")
    private ServiceType serviceType;

    private String standard_room;
    private String description_other_convenience;
    private Double pool_are;
    private int number_of_floors;
    @OneToMany(mappedBy = "service")
    private List<Contract> contracts;

    public Service() {
    }

    public Service(String service_id, String service_name, int service_area, Double service_cost, int service_max_people, RentType rentType, ServiceType serviceType, String standard_room, String description_other_convenience, Double pool_are, int number_of_floors, List<Contract> contracts) {
        this.service_id = service_id;
        this.service_name = service_name;
        this.service_area = service_area;
        this.service_cost = service_cost;
        this.service_max_people = service_max_people;
        this.rentType = rentType;
        this.serviceType = serviceType;
        this.standard_room = standard_room;
        this.description_other_convenience = description_other_convenience;
        this.pool_are = pool_are;
        this.number_of_floors = number_of_floors;
        this.contracts = contracts;
    }

    public String getService_id() {
        return service_id;
    }

    public void setService_id(String service_id) {
        this.service_id = service_id;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public int getService_area() {
        return service_area;
    }

    public void setService_area(int service_area) {
        this.service_area = service_area;
    }

    public Double getService_cost() {
        return service_cost;
    }

    public void setService_cost(Double service_cost) {
        this.service_cost = service_cost;
    }

    public int getService_max_people() {
        return service_max_people;
    }

    public void setService_max_people(int service_max_people) {
        this.service_max_people = service_max_people;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public String getStandard_room() {
        return standard_room;
    }

    public void setStandard_room(String standard_room) {
        this.standard_room = standard_room;
    }

    public String getDescription_other_convenience() {
        return description_other_convenience;
    }

    public void setDescription_other_convenience(String description_other_convenience) {
        this.description_other_convenience = description_other_convenience;
    }

    public Double getPool_are() {
        return pool_are;
    }

    public void setPool_are(Double pool_are) {
        this.pool_are = pool_are;
    }

    public int getNumber_of_floors() {
        return number_of_floors;
    }

    public void setNumber_of_floors(int number_of_floors) {
        this.number_of_floors = number_of_floors;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }
}
