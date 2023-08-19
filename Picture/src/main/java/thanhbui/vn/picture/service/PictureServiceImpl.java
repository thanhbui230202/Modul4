package thanhbui.vn.picture.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thanhbui.vn.picture.entity.Picture;
import thanhbui.vn.picture.repo.PictureRepository;

import java.util.List;
@Service
public class PictureServiceImpl implements PictureService{
    @Autowired
    private PictureRepository pictureRepository;
    @Override
    public void create(Picture picture) {
        pictureRepository.create(picture);
    }

    @Override
    public List<Picture> findAll() {
        return pictureRepository.findAll();
    }
}
