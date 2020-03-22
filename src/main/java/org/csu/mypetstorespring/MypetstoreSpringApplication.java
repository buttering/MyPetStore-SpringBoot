package org.csu.mypetstorespring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.csu.mypetstorespring.persistence")  //自动注入包扫描
public class MypetstoreSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MypetstoreSpringApplication.class, args);
    }

}
