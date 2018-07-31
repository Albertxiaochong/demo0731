package com.example.demo0731;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@tk.mybatis.spring.annotation.MapperScan(basePackages = "com.example.demo0731.dao.entity")
public class Demo0731Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo0731Application.class, args);
    }
}
