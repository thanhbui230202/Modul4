package thanhbui.bookmanageaop.service;

import thanhbui.bookmanageaop.entity.Book;
import thanhbui.bookmanageaop.entity.BookBorrower;

import java.util.List;

public interface BookBorrowerService {
    List<BookBorrower> findAll();
    void deleteById (String id);
    void create(BookBorrower bookBorrower);
    BookBorrower findById(String id);
}
