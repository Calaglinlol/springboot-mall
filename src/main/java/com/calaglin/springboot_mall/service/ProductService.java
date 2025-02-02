package com.calaglin.springboot_mall.service;

import com.calaglin.springboot_mall.dto.ProductRequest;
import com.calaglin.springboot_mall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
}
