package com.example.blogrestapi.controller;

import com.example.blogrestapi.entity.Blog;
import com.example.blogrestapi.service.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/list")
public class BookController {
    @Autowired
    private BlogService blogService;
    @GetMapping()
   public String displayList(Model model,Pageable pageable){
        model.addAttribute("blogs",blogService.findAll(pageable));
        return "blog/list";
    }

}
