package org.csu.mypetstorespring.persistence;

import org.csu.mypetstorespring.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMapper {

    //通过目录名查询产品
    List<Product> getProductListByCategory(String categoryId);
    //通过产品名查询产品
    Product getProduct(String productId);

}
