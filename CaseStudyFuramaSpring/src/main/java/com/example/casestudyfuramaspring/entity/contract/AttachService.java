package com.example.casestudyfuramaspring.entity.contract;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class AttachService {
    @Id
    @GeneratedValue
    private int attach_service_id;
    private String attach_service_name;
    private Double attach_service_cost;
    private int attach_service_unit;
    private String attach_service_status;
    @OneToMany(mappedBy = "attachService")
    private List<ContractDetail> contractDetails;

    public AttachService() {
    }

    public AttachService(int attach_service_id, String attach_service_name, Double attach_service_cost, int attach_service_unit, String attach_service_status, List<ContractDetail> contractDetails) {
        this.attach_service_id = attach_service_id;
        this.attach_service_name = attach_service_name;
        this.attach_service_cost = attach_service_cost;
        this.attach_service_unit = attach_service_unit;
        this.attach_service_status = attach_service_status;
        this.contractDetails = contractDetails;
    }

    public int getAttach_service_id() {
        return attach_service_id;
    }

    public void setAttach_service_id(int attach_service_id) {
        this.attach_service_id = attach_service_id;
    }

    public String getAttach_service_name() {
        return attach_service_name;
    }

    public void setAttach_service_name(String attach_service_name) {
        this.attach_service_name = attach_service_name;
    }

    public Double getAttach_service_cost() {
        return attach_service_cost;
    }

    public void setAttach_service_cost(Double attach_service_cost) {
        this.attach_service_cost = attach_service_cost;
    }

    public int getAttach_service_unit() {
        return attach_service_unit;
    }

    public void setAttach_service_unit(int attach_service_unit) {
        this.attach_service_unit = attach_service_unit;
    }

    public String getAttach_service_status() {
        return attach_service_status;
    }

    public void setAttach_service_status(String attach_service_status) {
        this.attach_service_status = attach_service_status;
    }

    public List<ContractDetail> getContractDetails() {
        return contractDetails;
    }

    public void setContractDetails(List<ContractDetail> contractDetails) {
        this.contractDetails = contractDetails;
    }
}
