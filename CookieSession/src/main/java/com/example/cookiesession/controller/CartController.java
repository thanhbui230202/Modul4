package com.example.cookiesession.controller;

import com.example.cookiesession.dto.CartDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class CartController {
    @GetMapping("/cart")
    public ModelAndView showCart(@SessionAttribute(value = "cart",required = false) CartDto cartDto){
        return new ModelAndView("product/cart","cart",cartDto);
    }
}
