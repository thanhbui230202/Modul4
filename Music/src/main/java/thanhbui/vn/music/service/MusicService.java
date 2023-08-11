package thanhbui.vn.music.service;

import thanhbui.vn.music.bean.Music;

import java.util.List;

public interface MusicService {
    void create(Music music);
    List<Music> findAll();
}
