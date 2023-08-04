package thanhbui.vn.showspice.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SpiceController {

    @GetMapping(value = "/show")
    public  String show(){
        return "index";
    }
    @PostMapping(value = "/save")
    public String save(@RequestParam("condiment") String[] condiment , Model model) {
        model.addAttribute("saves",condiment);
        return "submit";
    }
}
