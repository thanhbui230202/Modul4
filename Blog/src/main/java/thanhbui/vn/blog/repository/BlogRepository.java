package thanhbui.vn.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import thanhbui.vn.blog.entity.BLog;

public interface BlogRepository extends JpaRepository<BLog,String> {
}
