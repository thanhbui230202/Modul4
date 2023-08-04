package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import service.StudentServiceImpl;

public class StudentController {
    @Autowired
    StudentServiceImpl service;
    @GetMapping("/student/list")
    public String displayList(Model model){
        model.addAllAttributes("students",service.findAll());
        return "/student/list";
    }
}
