package cn.shop.service;

import cn.shop.entity.Product;

import java.util.List;

public interface ProductService {

    //查询产品列表
    List<Product> selectAll();
    //添加产品
    void add(Product product);


}
