package thanhbui.vn.blogupdate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import thanhbui.vn.blogupdate.entity.Blog;

public interface BlogRepository extends JpaRepository<Blog,String> {
}
