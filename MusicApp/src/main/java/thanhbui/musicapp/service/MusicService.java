package thanhbui.musicapp.service;

import thanhbui.musicapp.entity.Music;

import java.util.List;

public interface MusicService {
    List<Music> findAll();
    void create (Music music);
    void update (Music music);
    Music findById(String id);
}
