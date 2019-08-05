package com.xmy.controller;

import com.xmy.entity.Student;
import com.xmy.feign.FeignProviderClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * 监控数据
 * http://127.0.0.1:8060/actuator/hystrix.stream
 * 可视化界面生成地址
 * http://127.0.0.1:8060/hystrix
 * 输入监控数据地址: http://127.0.0.1:8060/actuator/hystrix.stream
 * http://127.0.0.1:8060/hystrix/monitor?stream=http%3A%2F%2F127.0.0.1%3A8060%2Factuator%2Fhystrix.stream&title=test
 */
@RestController
@RequestMapping("/hystrix")
public class hystrixHandler {

    @Autowired
    private FeignProviderClients feignProviderClients;


    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return feignProviderClients.findAll();
    }

    @GetMapping("/index")
    public String index() {
        return feignProviderClients.index();
    }


}
