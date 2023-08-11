package thanhbui.vn.music.repo;

import org.springframework.stereotype.Repository;
import thanhbui.vn.music.bean.Music;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MusicRepoImpl implements MusicRepo{
    private static Map<String,Music> musicMap;
    static {
        musicMap = new HashMap<>();
        musicMap.put("MS001",new Music("Người ấy","Trịnh Thăng Bình","nguoiay.mp4"));
    }
    @Override
    public void create(Music music) {
        musicMap.put(music.getName(),music);
    }

    @Override
    public List<Music> findAll() {
        return new ArrayList<>(musicMap.values());
    }
}
