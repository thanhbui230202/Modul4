package thanhbui.vn.productmanage.service;

import thanhbui.vn.productmanage.bean.Product;

import java.util.List;

public interface ProductService {
    void create(Product product);
    void update(Product product);
    void delete(Product product);
    Product findById(String id);
    List<Product> findAll();
}
