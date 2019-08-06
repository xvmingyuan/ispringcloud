package com.xmy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.internal.EnableZipkinServer;

/**
 * Zipkin 是一个可以采集并且跟踪分布式系统中请求数据的组件,让开发者可以更加直观的监控到请求在各个
 * 微服务所消耗的时间等,Zipkin:Zipkin Server 、Zipkin Client
 */
@SpringBootApplication
//声明启动 Zipkin Server
@EnableZipkinServer
public class ZipkinApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinApplication.class, args);
    }
}
