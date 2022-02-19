package com.sunshine;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.sunshine"})
@MapperScan("com.sunshine.infrastructure.mapper")
public class SunshineApplication {

    public static void main(String[] args) {
        SpringApplication.run(SunshineApplication.class, args);
    }
}
