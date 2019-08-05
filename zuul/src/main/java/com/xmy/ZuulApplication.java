package com.xmy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
/*
    网关启动类
    --包含了 EnableZuulServer,设置该类是网关的启动类

    --Zuul自带负载均衡功能
*/
@EnableZuulProxy
/*
    可以帮助Springboot应用将所有符合条件的
    @Configuration配置加载到当前Springboot创建并使用IOC容器中
*/
@EnableAutoConfiguration
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }
}
