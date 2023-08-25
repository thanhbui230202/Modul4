package thanhbui.vn.blogupdate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import thanhbui.vn.blogupdate.entity.Blog;
import thanhbui.vn.blogupdate.service.BlogService;
import thanhbui.vn.blogupdate.service.CategoryService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("")
public class BlogController {
    @Autowired
    private BlogService blogService;
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/list")
    public String displayList(Model model,
                              @RequestParam("page") Optional<Integer> page,
                              @RequestParam("size")Optional<Integer> size,
                              @RequestParam("sort")Optional<String> sort){
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(3);
        String sortField = sort.orElse("name");
        Pageable pageable = PageRequest.of(currentPage - 1, pageSize, Sort.by(sortField).ascending());
        Page<Blog> blogs = blogService.findAll(pageable);
        model.addAttribute("blogs", blogs);
        int totalPage = blogs.getTotalPages();
        model.addAttribute("currentPage", currentPage);
        if (totalPage > 1) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPage)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        return "blog/list";
    }
    @GetMapping("/create")
    public String displayCreate(Model model){
        model.addAttribute("blog", new Blog());
        model.addAttribute("categories",categoryService.findAll());
        model.addAttribute("action","create");
        return "blog/create";
    }
    @GetMapping("/edit")
    public String displayCreate(@RequestParam("id") String id,Model model, @RequestParam("page") int currentPage){
        model.addAttribute("blog",blogService.findById(id));
        model.addAttribute("categories",categoryService.findAll());
        model.addAttribute("currentPage", currentPage);
        model.addAttribute("action","edit");
        return "blog/create";
    }
    @PostMapping("/save")
    public String createOrEdit(@ModelAttribute("blog") Blog bLog, @RequestParam("action") String action,
                               @RequestParam(value = "currentPage",required = false) Integer currentPage){
        if ("create".equals(action)){
            blogService.create(bLog);
        }   else {
            blogService.update(bLog);
            return "redirect:/list?page=" + currentPage;
        }
        return "redirect:/list";
    }
    @GetMapping("/detail")
    public String detailList(@RequestParam("id") String id, Model model){
        model.addAttribute("blog",blogService.findById(id));
        return "blog/detail";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam("id") String id){
        blogService.deleteById(id);
        return "redirect:/list";
    }
}
