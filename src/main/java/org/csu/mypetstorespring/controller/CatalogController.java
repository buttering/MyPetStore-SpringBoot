package org.csu.mypetstorespring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/catalog")
public class CatalogController {

    @GetMapping("/view")
    public String view(){
        return "catalog/main"; // 相对路径，templates和static均被映射到根目录
    }
}
