package com.example.demoinii;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demoinii.mapper")
public class DemoiniiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoiniiApplication.class, args);
    }

}
