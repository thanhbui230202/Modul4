package thanhbui.bookmanageaop.service;

import thanhbui.bookmanageaop.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    void create(Book book);
    Book findById(String id);
}
