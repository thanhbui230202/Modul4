package thanhbui.bookmanageaop.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class BookBorrower {
    @Id
    @Column(columnDefinition = "varchar(25)")
    private String id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "idBook")
    private Book book;

    public BookBorrower() {
    }

    public BookBorrower(String id, String name, Book book) {
        this.id = id;
        this.name = name;
        this.book = book;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
