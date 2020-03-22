package org.csu.mypetstorespring.service;

import org.csu.mypetstorespring.domain.Category;
import org.csu.mypetstorespring.domain.Product;
import org.csu.mypetstorespring.persistence.CategoryMapper;
import org.csu.mypetstorespring.persistence.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private ProductMapper productMapper;

    public Category getCategory(String categoryId){
        return categoryMapper.getCategory(categoryId);
    }

    public List<Product> getProductListByCategory(String categoryId){
        return productMapper.getProductListByCategory(categoryId);
    }

    public Product getProduct(String productId){
        return productMapper.getProduct(productId);
    }
}
