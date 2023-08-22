package thanhbui.vn.blog.service;

import thanhbui.vn.blog.entity.BLog;

import java.util.List;

public interface BlogService {
    void create(BLog bLog);
    void update(BLog bLog);
    BLog findById(String id);
    List<BLog> findAll();
    void deleteById(String id);
}
