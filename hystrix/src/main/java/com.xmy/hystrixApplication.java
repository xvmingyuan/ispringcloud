package com.xmy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hystrix 在不改变各个微服务调用关系的前提下, 针对错误情况进行预先处理.
 * 设计原则:     1.服务隔离机制
 *              2.服务降级机制
 *              3.熔断机制
 *              4.提供实时的监控和报警功能
 *              5.提供实时的配置修改功能
 * Hystrix 数据监控需要结合 Spring Cloud Actuator来使用,Actuator 提供了对服务的健康,数据统计,
 *  可以通过hystrix-stream 节点获取监控的请求数据,提供了可视化的监控界面
 */
@SpringBootApplication
@EnableFeignClients
// 声明启用数据监控
@EnableCircuitBreaker
// 声明启动数据监控可视化仪表盘
@EnableHystrixDashboard
public class hystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(hystrixApplication.class, args);
    }
}
