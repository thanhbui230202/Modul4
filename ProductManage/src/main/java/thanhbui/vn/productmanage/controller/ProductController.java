package thanhbui.vn.productmanage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import thanhbui.vn.productmanage.bean.Product;
import thanhbui.vn.productmanage.service.ProductService;

@Controller
@RequestMapping(value = "")
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping(value = "/list")
    public String displayList(Model model){
        model.addAttribute("products",productService.findAll());
        return "product/list";
    }
    @GetMapping(value = "/create")
    public String displayCreate(Model model){
        model.addAttribute("product",new Product());
        model.addAttribute("action","create");
        return "product/create";
    }
    @GetMapping(value = "/edit")
    public String displayEdit(Model model,@RequestParam("id") String id){
        model.addAttribute("product",productService.findById(id));
        model.addAttribute("action","edit");
        return "product/create";
    }
    @PostMapping("/save")
    public String doCreateOrEdit(@ModelAttribute("product") Product product,
                                 @RequestParam("action") String action){
        if ("create".equals(action)){
            productService.create(product);
        }   else {
            productService.update(product);
        }
        return "redirect:/list";
    }
    @GetMapping(value = "/detail")
    public String detailList(Model model, @RequestParam("id") String id){
        Product product =productService.findById(id);
        model.addAttribute("product",product);
        return "/product/detail";
    }
    @GetMapping(value = "/delete")
    public String delete(Model model, @RequestParam("id") String id) {
        Product product =productService.findById(id);
        productService.delete(product);
        return "redirect:/list";
    }
}
