package thanhbui.vn.productmanage.repo;

import org.springframework.stereotype.Repository;
import thanhbui.vn.productmanage.bean.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepoImpl implements ProductRepo{
    private static Map<String,Product> productMap;
    static {
        productMap = new HashMap<>();
        productMap.put("P001", new Product("P001","TiVi",10000,"Good","SamSung"));
        productMap.put("P002", new Product("P002","Iphone",10000,"OK","Apple"));
        productMap.put("P003", new Product("P003","SamSung",10000,"Good","SamSung"));
        productMap.put("P004", new Product("P004","Tablet",10000,"OK","Apple"));
        productMap.put("P005", new Product("P005","Laptop",10000,"Good","Dell"));
    }
    @Override
    public void create(Product product) {
        if (!productMap.containsKey(product.getId())){
            productMap.put(product.getId(), product);
        }
    }

    @Override
    public void update(Product product) {
        if (productMap.containsKey(product.getId())){
            productMap.put(product.getId(), product);
        }
    }

    @Override
    public void delete(Product product) {
        if (productMap.containsKey(product.getId())){
            productMap.remove(product.getId(), product);
        }
    }

    @Override
    public Product findById(String id) {
        return productMap.get(id);
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }
}
