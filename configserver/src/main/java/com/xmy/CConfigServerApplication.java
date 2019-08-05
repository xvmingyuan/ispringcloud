package com.xmy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 远程仓库配置服务中心,所有微服务统一从此处调用相关配置文件
 */
@SpringBootApplication
// 启动配置服务
@EnableConfigServer
public class CConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CConfigServerApplication.class, args);
    }
}
