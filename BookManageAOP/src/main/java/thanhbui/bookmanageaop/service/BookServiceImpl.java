package thanhbui.bookmanageaop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thanhbui.bookmanageaop.entity.Book;
import thanhbui.bookmanageaop.repository.BookRepo;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepo bookRepo;
    @Override
    public List<Book> findAll() {
        return bookRepo.findAll();
    }

    @Override
    public void create(Book book) {
        bookRepo.save(book);
    }

    @Override
    public Book findById(String id) {
        return bookRepo.findById(id).orElse(null);
    }
}
