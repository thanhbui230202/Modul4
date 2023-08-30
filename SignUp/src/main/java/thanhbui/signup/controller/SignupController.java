package thanhbui.signup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import thanhbui.signup.entity.Signup;
import thanhbui.signup.service.SignupService;
import thanhbui.signup.utils.SignupValidator;

@Controller
@RequestMapping("")
public class SignupController {
    @Autowired
    private SignupService signupService;
    @Autowired
    private SignupValidator signupValidator;
    @GetMapping("/list")
    public String displayList(){
        return "signup/list";
    }
    @GetMapping("/create")
    public String displayCreate(Model model){
        model.addAttribute("signup",new Signup());
        return "signup/create";
    }
    @PostMapping("/save")
    public String create(@Validated @ModelAttribute("signup") Signup signup, BindingResult bindingResult){
        signupValidator.validate(signup,bindingResult);
        if (bindingResult.hasErrors()){
            return "signup/create";
        }
        signupService.create(signup);
        return "redirect:/list";
    }
}
