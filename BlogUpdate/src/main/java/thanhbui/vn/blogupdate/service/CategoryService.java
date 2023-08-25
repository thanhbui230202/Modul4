package thanhbui.vn.blogupdate.service;

import thanhbui.vn.blogupdate.entity.Category;

import java.util.List;

public interface CategoryService {
    Category findById(int id);
    List<Category> findAll();
}
