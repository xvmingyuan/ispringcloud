package com.xmy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 本地配置中心,功能:不重启微服务,同时修改配置
 *  Spring Cloud d,通过服务端可以为多个客户端提供配置服务,Spring Cloud Config可以将配置文件
 */
@SpringBootApplication
// 声明配置中心
@EnableConfigServer
public class ConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
