package com.wangallen.springbootmall.service.impl;

import com.wangallen.springbootmall.model.Product;
import com.wangallen.springbootmall.dao.ProductDao;
import com.wangallen.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
