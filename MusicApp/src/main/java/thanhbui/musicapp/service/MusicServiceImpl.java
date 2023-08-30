package thanhbui.musicapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thanhbui.musicapp.entity.Music;
import thanhbui.musicapp.repository.MusicRepository;

import java.util.List;
@Service
public class MusicServiceImpl implements MusicService{
    @Autowired
    private MusicRepository musicRepository;
    @Override
    public List<Music> findAll() {
        return musicRepository.findAll();
    }

    @Override
    public void create(Music music) {
        musicRepository.save(music);
    }

    @Override
    public void update(Music music) {
        musicRepository.save(music);
    }

    @Override
    public Music findById(String id) {
        return musicRepository.findById(id).orElse(null);
    }
}
