package thanhbui.vn.music.repo;

import thanhbui.vn.music.bean.Music;

import java.util.List;

public interface MusicRepo {
    void create(Music music);
    List<Music> findAll();
}
