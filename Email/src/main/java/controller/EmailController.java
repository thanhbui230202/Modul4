package controller;
import bean.SettingEmail;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.EmailService;

@RequestMapping("/email")
@Controller
public class EmailController {
    private EmailService emailService;
    @GetMapping(value = "/list")
    public String displayList(Model model){
        model.addAttribute("emails",emailService.findAll());
        return "index";
    }
    @GetMapping(value = "/update")
    public String displayUpdate(@RequestParam("id") String id, Model model){
        SettingEmail settingEmail = emailService.findByID(id);
        model.addAttribute("email",settingEmail);
        return "update";
    }
}
