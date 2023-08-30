package thanhbui.musicapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import thanhbui.musicapp.entity.Music;

public interface MusicRepository extends JpaRepository<Music,String> {
}
