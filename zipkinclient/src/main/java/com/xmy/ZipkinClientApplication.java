package com.xmy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * zipkin 客户端
 * 监控地址: http://localhost:9090/zipkin/
 *
 */
@SpringBootApplication
public class ZipkinClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinClientApplication.class, args);
    }
}
