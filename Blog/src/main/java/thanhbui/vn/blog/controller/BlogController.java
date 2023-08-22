package thanhbui.vn.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import thanhbui.vn.blog.entity.BLog;
import thanhbui.vn.blog.service.BlogService;

@Controller
@RequestMapping("")
public class BlogController {
    @Autowired
    private BlogService blogService;
    @GetMapping("/list")
    public String displayList(Model model){
        model.addAttribute("blogs",blogService.findAll());
        return "list";
    }
    @GetMapping("/create")
    public String displayCreate(Model model){
        model.addAttribute("blog", new BLog());
        model.addAttribute("action","create");
        return "create";
    }
    @GetMapping("/edit")
    public String displayCreate(@RequestParam("id") String id,Model model){
        model.addAttribute("blog",blogService.findById(id));
        model.addAttribute("action","edit");
        return "create";
    }
    @PostMapping("/save")
    public String createOrEdit(@ModelAttribute("blog") BLog bLog,@RequestParam("action") String action){
        if ("create".equals(action)){
            blogService.create(bLog);
        }   else {
            blogService.update(bLog);
        }
        return "redirect:/list";
    }
    @GetMapping("/detail")
    public String detailList(@RequestParam("id") String id, Model model){
        model.addAttribute("blog",blogService.findById(id));
        return "detail";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam("id") String id){
        blogService.deleteById(id);
        return "redirect:/list";
    }
}
