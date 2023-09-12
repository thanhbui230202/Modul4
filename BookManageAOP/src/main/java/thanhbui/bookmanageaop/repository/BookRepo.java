package thanhbui.bookmanageaop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import thanhbui.bookmanageaop.entity.Book;

public interface BookRepo extends JpaRepository<Book,String> {
}
