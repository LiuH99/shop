package cn.shop.dao;

import cn.shop.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("productDao")
public interface ProductDao {

    //查询所有产品
    List<Product> selectAll();
    //添加产品
    void insert(Product product);

}
