package com.calaglin.springboot_mall.service;

import com.calaglin.springboot_mall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);
}
