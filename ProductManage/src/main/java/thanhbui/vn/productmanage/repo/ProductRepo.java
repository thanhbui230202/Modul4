package thanhbui.vn.productmanage.repo;

import thanhbui.vn.productmanage.bean.Product;

import java.util.List;

public interface ProductRepo {
    void create(Product product);
    void update(Product product);
    void delete(Product product);
    Product findById(String id);
    List<Product> findAll();
}
