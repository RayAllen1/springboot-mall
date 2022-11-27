package com.wangallen.springbootmall.dao;

import com.wangallen.springbootmall.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao {

    Product getProductById(Integer productId);
}
