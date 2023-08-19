package thanhbui.vn.picture.repo;

import org.springframework.stereotype.Repository;
import thanhbui.vn.picture.entity.Picture;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class PictureRepositoryImpl implements PictureRepository{
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public void create(Picture picture) {
        entityManager.persist(picture);
    }

    @Override
    public List<Picture> findAll() {
        return entityManager.createQuery("from Picture s").getResultList();
    }
}
