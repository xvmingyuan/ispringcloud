package com.xmy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 微服务 生产者
@SpringBootApplication
public class ProviderApplication1 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication1.class, args);
    }
}
