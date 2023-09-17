package com.example.cookiesession.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Product {
    @Id
    @Column(columnDefinition = "varchar(20)")
    private String id;
    private String name;
    private String image;
    private double discount;
    private double cost;

    public Product() {
    }

    public Product(String id, String name, String image, double discount, double cost) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.discount = discount;
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
