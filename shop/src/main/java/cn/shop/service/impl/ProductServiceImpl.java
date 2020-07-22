package cn.shop.service.impl;

import cn.shop.dao.ProductDao;
import cn.shop.entity.Product;
import cn.shop.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Resource(name="productDao")
    private ProductDao productDao;

    @Override
    public List<Product> selectAll() {
        return productDao.selectAll();
    }

    @Override
    public void add(Product product) {
        productDao.insert(product);
    }
}
