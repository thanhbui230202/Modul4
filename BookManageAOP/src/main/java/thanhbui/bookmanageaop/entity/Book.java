package thanhbui.bookmanageaop.entity;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    @Column(columnDefinition = "varchar(20)")
    private String idBook;
    private String bookName;
    private int quantity;
    public Book() {
    }

    public Book(String idBook, String bookName, int quantity) {
        this.idBook = idBook;
        this.bookName = bookName;
        this.quantity = quantity;
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
