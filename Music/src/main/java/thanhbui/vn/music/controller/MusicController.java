package thanhbui.vn.music.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import thanhbui.vn.music.bean.Music;
import thanhbui.vn.music.service.MusicService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "")
public class MusicController {
    @Autowired
    MusicService musicService;
    @GetMapping(value = "/list")
    public String display(Model model){
        model.addAttribute("musics",musicService.findAll());
        return "index";
    }

    @GetMapping("/create")
    public String displayCreate(Model model){
        model.addAttribute("music", new Music());
        model.addAttribute("category",getCategory());
        return "create";
    }

    @PostMapping(value = "/doCreate")
    public String create(@ModelAttribute("music") Music music ){
        String filePath = ".mp3";
        if (isAcceptedFormat(filePath)){
            musicService.create(music);
        }else {
            System.out.println("File format is not accepted.");
        }
        return "redirect:/list";
    }

    public List<String> getCategory(){
        List<String> category = new ArrayList<>();
        category.add("Rock");
        category.add("Bolero");
        category.add("Trữ tình");
        category.add("EDM");
        category.add("Nonstop");
        return category;
    }
    public static boolean isAcceptedFormat(String filePath) {
        String[] acceptedExtensions = { ".mp3", ".wav", ".ogg", ".m4p" };
        String fileExtension = getFileExtension(filePath);
        for (String acceptedExtension : acceptedExtensions) {
            if (fileExtension.equalsIgnoreCase(acceptedExtension)) {
                return true;
            }
        }
        return false;
    }

    public static String getFileExtension(String filePath) {
        int lastDotIndex = filePath.lastIndexOf(".");
        if (lastDotIndex > 0 && lastDotIndex < filePath.length() - 1) {
            return filePath.substring(lastDotIndex).toLowerCase();
        }
        return "";
    }
}
