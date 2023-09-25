package com.example.blogrestapi.controller;

import com.example.blogrestapi.dto.BlogDto;
import com.example.blogrestapi.entity.Blog;
import com.example.blogrestapi.service.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController()
@RequestMapping("/api/vi/blog")
public class BlogRestController {
    @Autowired
    private BlogService blogService;
    @GetMapping("")
    public ResponseEntity<List<Blog>> findAll(){
        List<Blog> blogList = blogService.findAll();
        if (blogList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(blogList,HttpStatus.OK);
        }
    }
    @GetMapping("/search")
    public ResponseEntity<List<Blog>> searchByName(@RequestParam("name") String name){
        return new ResponseEntity<>(blogService.searchByName(name),HttpStatus.OK);
    }
    @GetMapping("/posts")
    public Page<Blog> getPosts(Pageable pageable){
        Pageable p = PageRequest.of(pageable.getPageNumber()+1, pageable.getPageSize(), pageable.getSort());
        return blogService.findAll(p);
    }
}
