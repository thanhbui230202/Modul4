package thanhbui.vn.appmusic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import thanhbui.vn.appmusic.service.MusicService;

@Controller
@RequestMapping(value = "")
public class MusicController {
    @Autowired
    private MusicService musicService;
    @GetMapping(value = "/list")
    public String showList(Model model){
        model.addAttribute("musics",musicService.findAll());
        return "list";
    }
}
