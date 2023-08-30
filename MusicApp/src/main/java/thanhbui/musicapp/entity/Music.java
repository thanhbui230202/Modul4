package thanhbui.musicapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Music {
    @Id
    @Column(columnDefinition = "varchar(10)")
    private String id;

    @NotBlank(message = "Name not empty")
    @Size(min = 1, max = 800, message = "{name}")
    @Pattern(regexp = "^[a-zA-Z0-9\\s]*$", message = "Name must not contain special characters.")
    private String name;

    @NotBlank(message = "Author not empty")
    @Size(min = 1, max = 300, message = "{author}")
    @Pattern(regexp = "^[a-zA-Z0-9\\s]*$", message = "Author must not contain special characters.")
    private String author;

    @NotBlank(message = "Category not empty")
    @Size(min = 1, max = 1000, message = "{category}")
    @Pattern(regexp = "^[a-zA-Z0-9,\\s]*$", message = "Category must not contain special characters.")
    private String category;

    public Music() {
    }

    public Music(String id, String name, String author, String category) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.category = category;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
