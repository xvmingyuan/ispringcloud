package com.xmy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// 微服务 注册服务中心 监测所有注册到中心的微服务
// springboot 启动入口
@SpringBootApplication
// 设为是EurekaServer
@EnableEurekaServer

public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
