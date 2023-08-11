package thanhbui.vn.music.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thanhbui.vn.music.bean.Music;
import thanhbui.vn.music.repo.MusicRepo;

import java.util.List;
@Service
public class MusicServiceImpl implements MusicService{
    @Autowired
    MusicRepo musicRepo;
    @Override
    public void create(Music music) {
        musicRepo.create(music);
    }

    @Override
    public List<Music> findAll() {
        return musicRepo.findAll();
    }
}
