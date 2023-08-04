package com.example.convertmoney.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class ConvertController {

    @GetMapping(value = "/current")
    public String index(){

        return "index";
    }
    @PostMapping("/usd")
    public String submit(@RequestParam float usd , float rate, Model model){
        float result = usd * rate;
        model.addAttribute("results",result);
        return "Submit";
    }
}
