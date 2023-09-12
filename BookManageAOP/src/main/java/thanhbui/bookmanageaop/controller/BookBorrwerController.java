package thanhbui.bookmanageaop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import thanhbui.bookmanageaop.entity.Book;
import thanhbui.bookmanageaop.entity.BookBorrower;
import thanhbui.bookmanageaop.service.BookBorrowerService;
import thanhbui.bookmanageaop.service.BookService;

@Controller
@RequestMapping(value = "")
public class BookBorrwerController {
    @Autowired
    private BookBorrowerService bookBorrowerService;
    @Autowired
    private BookService bookService;
    @GetMapping(value = "/listRent")
    public String displayRentList(Model model){
        model.addAttribute("borrowers",bookBorrowerService.findAll());
        return "book/listBorrower";
    }
    @GetMapping("/remove")
    public String removeBook(@RequestParam("id") String id, RedirectAttributes attributes){
        BookBorrower borrower =  bookBorrowerService.findById(id);
        Book book = borrower.getBook();
        if (borrower.getId().equals(id)){
            book.setQuantity(book.getQuantity() +1);
            bookBorrowerService.deleteById(id);
        }
        return "redirect:/listRent";
    }
}
