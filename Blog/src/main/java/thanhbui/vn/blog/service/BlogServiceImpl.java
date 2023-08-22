package thanhbui.vn.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thanhbui.vn.blog.entity.BLog;
import thanhbui.vn.blog.repository.BlogRepository;

import java.util.List;
@Service
public class BlogServiceImpl implements BlogService{
    @Autowired
    BlogRepository blogRepository;
    @Override
    public void create(BLog bLog) {
        blogRepository.save(bLog);
    }

    @Override
    public void update(BLog bLog) {
        blogRepository.save(bLog);
    }

    @Override
    public BLog findById(String id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public List<BLog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public void deleteById(String id) {
        blogRepository.deleteById(id);
    }
}
