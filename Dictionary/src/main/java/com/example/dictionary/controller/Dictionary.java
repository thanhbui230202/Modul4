package com.example.dictionary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class Dictionary {

    public String translate(String word){
        String [] arrViet = {"Chao","ten","Cay","nam","Mot","Muoi"};
        String [] arrEng = {"hi","name","spicy","man","one","ten"};
        for (int i = 0; i <arrViet.length ; i++) {
            if(word.equals(arrEng[i])){
                return arrViet[i];
            }
        }
        return "Not Found";
    }

    @GetMapping(value = ("/translate"))
    public String index(){
        return "index";
    }
    @PostMapping  ("/convert")
    public String Convert(@RequestParam String eng, Model model)
    {
        model.addAttribute("results",translate(eng));
        return "translate";
    }
}
