package com.example.demodatajpa.controller;

import com.example.demodatajpa.entity.Book;
import com.example.demodatajpa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping("/list")
    public String displayList(Model model){
        model.addAttribute("books",bookService.findAll());
        return "list";
    }
    @GetMapping("/create")
    public String displayCreate(Model model){
        model.addAttribute("book",new Book());
        return "create";
    }
}
