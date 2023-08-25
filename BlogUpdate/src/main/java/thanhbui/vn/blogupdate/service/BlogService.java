package thanhbui.vn.blogupdate.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import thanhbui.vn.blogupdate.entity.Blog;

public interface BlogService {
    void create(Blog blog);
    void update(Blog blog);
    void deleteById(String id);
    Blog findById(String id);
    Page<Blog>findAll(Pageable pageable);
}
