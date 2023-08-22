package thanhbui.vn.blog.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class BLog {
    @Id
    @Column(columnDefinition = "varchar(20)")
    private String id;
    private String name;
    @Column(columnDefinition = "text")
    private String content;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date publish;

    public BLog() {
    }

    public BLog(String id, String name, String content, Date publish) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.publish = publish;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPublish() {
        return publish;
    }

    public void setPublish(Date publish) {
        this.publish = publish;
    }
}
