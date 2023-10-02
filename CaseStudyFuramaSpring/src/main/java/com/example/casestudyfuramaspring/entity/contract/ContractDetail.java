package com.example.casestudyfuramaspring.entity.contract;

import javax.persistence.*;

@Entity
public class ContractDetail {
    @Id
    @GeneratedValue
    private int contract_detail_id;
    @ManyToOne
    @JoinColumn(name = "contract_id")
    private Contract contract;
    @ManyToOne
    @JoinColumn(name = "attach_service_id")
    private AttachService attachService;

    public ContractDetail() {
    }

    public ContractDetail(int contract_detail_id, Contract contract, AttachService attachService) {
        this.contract_detail_id = contract_detail_id;
        this.contract = contract;
        this.attachService = attachService;
    }

    public int getContract_detail_id() {
        return contract_detail_id;
    }

    public void setContract_detail_id(int contract_detail_id) {
        this.contract_detail_id = contract_detail_id;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public AttachService getAttachService() {
        return attachService;
    }

    public void setAttachService(AttachService attachService) {
        this.attachService = attachService;
    }
}
