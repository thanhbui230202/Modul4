package thanhbui.bookmanageaop.entity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class BookBrrDTO {
    private String id;
    private String name;
    private Book book;

    public BookBrrDTO() {
    }

    public BookBrrDTO(String id, String name, String bookId) {
        this.id = id;
        this.name = name;
        this.bookId = bookId;
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

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    private String bookId;
}
