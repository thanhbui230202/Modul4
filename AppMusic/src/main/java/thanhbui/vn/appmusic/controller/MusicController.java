package thanhbui.vn.appmusic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import thanhbui.vn.appmusic.entity.Music;
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
    @GetMapping(value = "/create")
    public String displayCreate(Model model){
        model.addAttribute("music",new Music());
        model.addAttribute("action","create");
        return "create";
    }
    @GetMapping(value = "/edit")
    public String displayEdit(Model model,@RequestParam("id") String id){
        Music music = musicService.finById(id);
        model.addAttribute("music",music);
        model.addAttribute("action","edit");
        return "create";
    }
    @PostMapping("/save")
    public String doCreateOrEdit(@ModelAttribute("music") Music music,
                                 @RequestParam("action") String action){
        if ("create".equals(action)){
            musicService.create(music);
        }   else {
            musicService.update(music);
        }
        return "redirect:/list";
    }
}
