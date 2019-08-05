package com.xmy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Spring Cloud Ribbon 是一个负载均衡解决方案,Ribbon 是netflix 发布的负载均衡器,
 * Spring Cloud Ribbon 是基于Netflix Ribbon 实现,是一个用于对http请求进行控制的负载客户端
 * 基本算法 轮询(默然算法) 随机 加权随机, 同时开发者可以自定义自己负载均衡算法
 */
@SpringBootApplication
public class RibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class, args);
    }

    @Bean
    // 实现负载均衡
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
