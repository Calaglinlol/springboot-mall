package com.calaglin.springboot_mall.dao;

import com.calaglin.springboot_mall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
