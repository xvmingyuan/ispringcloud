package com.xmy.feign.impl;

import com.xmy.entity.Student;
import com.xmy.feign.FeignProviderClients;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * 熔断机制 服务访问不通时,访问此类方法
 * <p>
 * 熔断机制原理:面向切片编程
 *
 * @author xmy
 * @date 2019-07-30 22:15
 */
@Component
public class FeignError implements FeignProviderClients {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "hystrix客户端提示: 服务器维护中.....";
    }
}
