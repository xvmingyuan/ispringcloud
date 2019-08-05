package com.xmy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * feign 声明式,模板化的web service 客户端,它简化了开发者编程web服务端的操作,
 * 只需通过接口和注解滴啊用http api,spring Cloud Feign,整合 Ribbon 和 Hystrix
 * 基于注解,负载均衡,服务熔断等一系列功能
 *
 */
@SpringBootApplication
@EnableFeignClients
public class FeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }
}
