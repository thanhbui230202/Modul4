package thanhbui.vn.email.controller;
import org.springframework.web.bind.annotation.*;
import thanhbui.vn.email.bean.SettingEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import thanhbui.vn.email.service.EmailService;

@Controller
@RequestMapping("")
public class EmailController {
    @Autowired
    private EmailService emailService;
    @GetMapping(value = "/index")
    public String displayList(Model model){
        model.addAttribute("emails",emailService.findAll());
        return "index";
    }
    @GetMapping(value = "/edit")
    public String displayUpdate(@RequestParam("id") String id, Model model){
        SettingEmail settingEmail = emailService.findByID(id);
        model.addAttribute("email",settingEmail);
        return "update";
    }
    @PostMapping(value = "/update")
    public String update(@ModelAttribute ("email") SettingEmail settingEmail){
        emailService.update(settingEmail);
        return "redirect:/index";
    }
}
