package thanhbui.bookmanageaop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import thanhbui.bookmanageaop.entity.Book;
import thanhbui.bookmanageaop.entity.BookBorrower;
import thanhbui.bookmanageaop.entity.BookBrrDTO;
import thanhbui.bookmanageaop.service.BookBorrowerService;
import thanhbui.bookmanageaop.service.BookService;

@Controller
@RequestMapping(value = "")
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private BookBorrowerService bookBorrowerService;
    @GetMapping("/list")
    public String displayList(Model model){
        model.addAttribute("books",bookService.findAll());
        return "book/list";
    }
    @GetMapping("/rent")
    public String displayRent(Model model ,@RequestParam("id") String id){
        long idRadom = (long) Math.floor(Math.random() * 100000);
        model.addAttribute("bookBrrow", new BookBrrDTO());
        model.addAttribute("book", bookService.findById(id));
        model.addAttribute("idRadom",idRadom);
        return "book/create";
    }
    @PostMapping("/save")
    public String createBook(@ModelAttribute("bookBrrow") BookBrrDTO bookBrrow, RedirectAttributes attributes){
        Book book = bookService.findById(bookBrrow.getBookId());
        BookBorrower bookBorrower = new BookBorrower(bookBrrow.getId(), bookBrrow.getName(), book);
        if (book.getQuantity() == 0){
            attributes.addFlashAttribute("error","Book dont have in library");
            return "redirect:/list";
        }else {
            book.setQuantity(book.getQuantity() -1);
            bookBorrowerService.create(bookBorrower);
        }
        return "redirect:/listRent";
    }
}
