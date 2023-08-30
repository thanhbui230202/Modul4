package thanhbui.musicapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import thanhbui.musicapp.entity.Music;
import thanhbui.musicapp.service.MusicService;

@Controller
@RequestMapping("")
public class MusicController {
    @Autowired
    private MusicService musicService;
    @GetMapping("/list")
    public String displayList(Model model){
        model.addAttribute("musics",musicService.findAll());
        return "music/list";
    }
    @GetMapping("/create")
    public String displayCreate(Model model){
        model.addAttribute("music", new Music());
        return "music/create";
    }
    @PostMapping("/save")
    public String create(@Validated @ModelAttribute("music") Music music, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "music/create";
        }
        musicService.create(music);
        return "redirect:/list";
    }
    @GetMapping("/edit")
    public String displayUpdate(Model model, @RequestParam("id") String id){
        model.addAttribute("music",musicService.findById(id));
        return "music/update";
    }
    @PostMapping("/update")
    public String update(@Validated @ModelAttribute("music") Music music, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "music/update";
        }
        musicService.update(music);
        return "redirect:/list";
    }
}
