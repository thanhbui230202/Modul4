package thanhbui.vn.picture.repo;

import thanhbui.vn.picture.entity.Picture;

import java.util.List;

public interface PictureRepository {
    void create(Picture picture);
    List<Picture> findAll();
}
