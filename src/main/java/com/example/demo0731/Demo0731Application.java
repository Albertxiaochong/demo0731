package com.example.demo0731;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.example.demo0731.dao.entity")
public class Demo0731Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo0731Application.class, args);
    }
}
