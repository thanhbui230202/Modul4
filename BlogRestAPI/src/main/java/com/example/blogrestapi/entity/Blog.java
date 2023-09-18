package com.example.blogrestapi.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
@Entity
public class Blog {
    @Id
    @Column(columnDefinition = "varchar(20)")
    private String id;
    private String name;
    @Column(columnDefinition = "text")
    private String content;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date publish;
    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;

    public Blog() {
    }

    public Blog(String id, String name, String content, Date publish, Category category) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.publish = publish;
        this.category = category;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPublish() {
        return publish;
    }

    public void setPublish(Date publish) {
        this.publish = publish;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
