package thanhbui.vn.demospringmvc.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import thanhbui.vn.demospringmvc.service.StudentService;
import thanhbui.vn.demospringmvc.service.StudentServiceImpl;


@Controller
public class StudentController {
    @Autowired
    StudentService service;

    @RequestMapping(value = "/student/list")
    public String displayList(Model model){
        model.addAttribute("students",service.findAll());
        return "/student/list";
    }
}
