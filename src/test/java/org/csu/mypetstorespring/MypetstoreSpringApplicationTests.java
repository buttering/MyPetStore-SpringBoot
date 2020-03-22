package org.csu.mypetstorespring;

import org.assertj.core.error.ShouldBeAfterYear;
import org.csu.mypetstorespring.domain.Category;
import org.csu.mypetstorespring.domain.Product;
import org.csu.mypetstorespring.service.CatalogService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@MapperScan("org.csu.mypetstorespring.persistence")
class MypetstoreSpringApplicationTests {

    @Autowired
    private CatalogService catalogService;


    @Test
    void contextLoads() {
    }

    @Test
    void testCatecory(){
        Category c =catalogService.getCategory("BIRDS");
        System.out.println(c.getCategoryId() + c.getDescription() + c.getName());
    }

    @Test
    void testProduct(){
        List<Product> productList = catalogService.getProductListByCategory("BIRDS");
        System.out.println(productList.size());
    }

}
