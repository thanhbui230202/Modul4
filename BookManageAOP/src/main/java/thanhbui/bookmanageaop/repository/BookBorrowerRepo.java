package thanhbui.bookmanageaop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import thanhbui.bookmanageaop.entity.BookBorrower;

public interface BookBorrowerRepo extends JpaRepository<BookBorrower,String> {
}
