package thanhbui.bookmanageaop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thanhbui.bookmanageaop.entity.BookBorrower;
import thanhbui.bookmanageaop.repository.BookBorrowerRepo;

import java.util.List;
@Service
public class BookBorrowerServiceImpl implements BookBorrowerService{
    @Autowired
    private BookBorrowerRepo bookBorrowerRepo;
    @Override
    public List<BookBorrower> findAll() {
        return bookBorrowerRepo.findAll();
    }

    @Override
    public void deleteById(String id) {
        bookBorrowerRepo.deleteById(id);
    }

    @Override
    public void create(BookBorrower bookBorrower) {
        bookBorrowerRepo.save(bookBorrower);
    }

    @Override
    public BookBorrower findById(String id) {
        return bookBorrowerRepo.findById(id).orElse(null);
    }

}
