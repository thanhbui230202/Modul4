package thanhbui.vn.calculator.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("/index")
public class CalculatorController {
    @GetMapping(value = "")
    public String show(){
        return "index";
    }
    @PostMapping(value = "/calculator")
    public String calculator(@RequestParam double a,double b,@RequestParam ("cal") String cal , Model model){
       double result = 0;
        switch (cal){
            case "Addtion":
                result = a + b;
                break;
            case "Subtraction":
                result = a - b;
                break;
            case "Multiplication":
                result = a * b;
                break;
            case "Division":
                result = a / b;
                break;
        }
        model.addAttribute("cals",cal);
        model.addAttribute("results",result);
        return "index";
    }
}
