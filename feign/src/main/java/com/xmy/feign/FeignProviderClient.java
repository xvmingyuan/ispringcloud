package com.xmy.feign;

import com.xmy.entity.Student;
import com.xmy.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * feign 声明式接口
 * FeignClient
 *  value: 服务中心 服务的名字
 *  fallback: 熔断时访问的类
 *  熔断原理:AOP编程(利用 反射机制 )
 *      使用注解模式,先访问注解上的URL 如果访问通 直接返回结果给到原来方法
 *          如果访问不通,访问 fallback 上定义的实现类对应的方法
 */
@FeignClient(value = "provider", fallback = FeignError.class)
public interface FeignProviderClient {
    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public String index();
}
