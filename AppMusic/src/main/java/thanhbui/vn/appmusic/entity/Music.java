package thanhbui.vn.appmusic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "musics")
public class Music {
    @Id
    @Column(name = "music_id", columnDefinition = "varchar(20)")
    private String id;
    private String name;
    private String single;
    private String category;
    private String path;

    public Music() {
    }

    public Music(String id,String name, String single, String category, String path) {
        this.id = id;
        this.name = name;
        this.single = single;
        this.category = category;
        this.path = path;
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

    public String getSingle() {
        return single;
    }

    public void setSingle(String single) {
        this.single = single;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
