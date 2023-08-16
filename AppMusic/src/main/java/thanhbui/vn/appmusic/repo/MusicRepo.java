package thanhbui.vn.appmusic.repo;

import thanhbui.vn.appmusic.entity.Music;

import java.util.List;

public interface MusicRepo {
    List<Music> findAll();
    Music finById(String id);
    void create(Music music);
    void update(Music music);
    void delete(Music music);
}
