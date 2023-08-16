package thanhbui.vn.appmusic.repo;

import org.springframework.stereotype.Repository;
import thanhbui.vn.appmusic.entity.Music;

import java.util.List;
@Repository
public class MusicRepoImpl implements MusicRepo{
    @Override
    public List<Music> findAll() {
        return null;
    }

    @Override
    public Music finById(String id) {
        return null;
    }

    @Override
    public void create(Music music) {

    }

    @Override
    public void update(Music music) {

    }

    @Override
    public void delete(Music music) {

    }
}
