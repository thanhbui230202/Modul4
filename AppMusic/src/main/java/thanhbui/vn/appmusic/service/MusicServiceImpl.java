package thanhbui.vn.appmusic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thanhbui.vn.appmusic.entity.Music;
import thanhbui.vn.appmusic.repo.MusicRepo;

import java.util.List;
@Service
public class MusicServiceImpl implements MusicService{
    @Autowired
    private MusicRepo musicRepo;
    @Override
    public List<Music> findAll() {
        return musicRepo.findAll();
    }

    @Override
    public Music finById(String id) {
        return musicRepo.finById(id);
    }

    @Override
    public void create(Music music) {
        musicRepo.create(music);
    }

    @Override
    public void update(Music music) {
        musicRepo.update(music);
    }

    @Override
    public void delete(Music music) {
        musicRepo.delete(music);
    }
}
