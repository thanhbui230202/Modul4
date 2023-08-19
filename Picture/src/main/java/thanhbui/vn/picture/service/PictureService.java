package thanhbui.vn.picture.service;

import thanhbui.vn.picture.entity.Picture;

import java.util.List;

public interface PictureService {
    void create(Picture picture);
    List<Picture> findAll();
}
