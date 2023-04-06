package com.example.ieiltps_back;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.ieiltps_back.mapper")
public class IeiltpsBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(IeiltpsBackApplication.class, args);
    }

}
