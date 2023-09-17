package com.example.cookiesession.controller;

import com.example.cookiesession.dto.CartDto;
import com.example.cookiesession.dto.ProductDto;
import com.example.cookiesession.entity.Product;
import com.example.cookiesession.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

@Controller
@RequestMapping()
@SessionAttributes("cart")
public class ProductController {
    @ModelAttribute("cart")
    public CartDto initCart(){
        return new CartDto();
    }
    @Autowired
    private ProductService productService;
    @GetMapping("/list")
    public ModelAndView list(Model model,@CookieValue(value = "id",defaultValue = "-1") String idProduct){
        if (idProduct != "-1"){
            model.addAttribute("history",productService.findById(idProduct).get());
        }
        return new ModelAndView("product/list","listProduct",productService.findAll());
    }
    @GetMapping("/detail")
    public ModelAndView detailProduct(@RequestParam ("id") String id, HttpServletResponse response){
        Cookie cookie = new Cookie("id",id+"");
        cookie.setMaxAge(1*24*60*60);
        cookie.setPath("/");
        response.addCookie(cookie);
        return new ModelAndView("product/detail","product",productService.findById(id).orElse(null));
    }
    @GetMapping("/save/{id}")
    public String addCart(@PathVariable String id, @SessionAttribute("cart")CartDto cartDto){
        Optional<Product> optionalProduct = productService.findById(id);
        if (optionalProduct.isPresent()){
            ProductDto productDto = new ProductDto();
            BeanUtils.copyProperties(optionalProduct.get(),productDto);
            cartDto.addProduct(productDto);
        }
        return  "redirect:/cart";
    }
}
