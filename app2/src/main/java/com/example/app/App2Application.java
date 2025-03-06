package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class App2Application {
    public static void main(String[] args) {
        SpringApplication.run(App2Application.class, args);
    }
} 