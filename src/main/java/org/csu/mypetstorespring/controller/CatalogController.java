package org.csu.mypetstorespring.controller;

import org.csu.mypetstorespring.domain.Category;
import org.csu.mypetstorespring.domain.Product;
import org.csu.mypetstorespring.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private CatalogService catalogService;

    @GetMapping("/view")
    public String view(){
        return "catalog/main"; // 相对路径，templates和static均被映射到根目录
    }

    @GetMapping("/viewCategory")
    public String viewCategory(String categoryId, Model model){  // 对象取值
        if(categoryId != null){
            Category category = catalogService.getCategory(categoryId);
            List<Product> productList = catalogService.getProductListByCategory(categoryId);
            model.addAttribute("category" , category);
            model.addAttribute("productList",productList);
            return "catalog/category";
        }else{
            return "catalog/main";
        }
    }
}
