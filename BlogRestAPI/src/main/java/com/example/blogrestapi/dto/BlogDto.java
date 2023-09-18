package com.example.blogrestapi.dto;

import com.example.blogrestapi.entity.Category;

import java.util.Date;

public class BlogDto {
    private String id;
    private String name;
    private String content;
    private Date publish;
    private Category category;

    public BlogDto() {
    }

    public BlogDto(String id, String name, String content, Date publish, Category category) {
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
