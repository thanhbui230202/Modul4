package thanhbui.vn.blogupdate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import thanhbui.vn.blogupdate.entity.Blog;
import thanhbui.vn.blogupdate.repository.BlogRepository;

@Service
public class BlogServiceImpl implements BlogService{
    @Autowired
    private BlogRepository blogRepository;
    @Override
    public void create(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void update(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void deleteById(String id) {
        blogRepository.deleteById(id);
    }

    @Override
    public Blog findById(String id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }
}
