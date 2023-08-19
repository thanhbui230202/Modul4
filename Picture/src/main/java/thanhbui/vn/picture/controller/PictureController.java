package thanhbui.vn.picture.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import thanhbui.vn.picture.entity.Picture;
import thanhbui.vn.picture.service.PictureService;

@Controller
@RequestMapping("")
public class PictureController {
    @Autowired
    private PictureService pictureService;
    @GetMapping(value = "/list")
    public String displayList(Model model){
        model.addAttribute("pictures",pictureService.findAll());
        return "list";
    }
    @GetMapping("/create")
    public String displayCreate(Model model){
        model.addAttribute("picture",new Picture());
        return "create";
    }
    @PostMapping("/save")
    public String createPicture(@ModelAttribute("picture") Picture picture){
        pictureService.create(picture);
        return "redirect:/list";
    }
}
