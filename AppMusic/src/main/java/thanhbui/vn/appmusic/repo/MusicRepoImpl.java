package thanhbui.vn.appmusic.repo;

import com.ibm.jvm.dtfjview.Session;
import org.springframework.stereotype.Repository;
import thanhbui.vn.appmusic.entity.Music;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

@Repository
@Transactional
public class MusicRepoImpl implements MusicRepo{
    @PersistenceContext
    EntityManager manager;
    @Override
    public List<Music> findAll() {
        return manager.createQuery("from musics s").getResultList();
    }

    @Override
    public Music finById(String id) {
        return manager.find(Music.class,id);
    }

    @Override
    public void create(Music music) {
        manager.persist(music);
    }

    @Override
    public void update(Music music) {
        manager.merge(music);
    }

    @Override
    public void delete(Music music) {
        manager.remove(music);
    }
}
