package com.calaglin.springboot_mall.service.impl;

import com.calaglin.springboot_mall.dao.ProductDao;
import com.calaglin.springboot_mall.dto.ProductRequest;
import com.calaglin.springboot_mall.model.Product;
import com.calaglin.springboot_mall.service.ProductService;
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

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
}
