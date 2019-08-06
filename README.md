SpringCloud 全家桶 

    Eureka 服务注册中心
    /*
     * 注册服务中心 监测所有注册到中心的微服务
     */
    
    RestTemplate
    /**
     * restTemplate 模式访问
     * restTemplate 模式构建消费者
     */
     
    Ribbon
    /**
     * Spring Cloud Ribbon 是一个负载均衡解决方案,Ribbon 是netflix 发布的负载均衡器,
     * Spring Cloud Ribbon 是基于Netflix Ribbon 实现,是一个用于对http请求进行控制的负载客户端
     * 基本算法 轮询(默然算法) 随机 加权随机, 同时开发者可以自定义自己负载均衡算法
     */
     
    Hystrix
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
           
    Feign  
    /**
     * feign 声明式,模板化的web service 客户端,它简化了开发者编程web服务端的操作,
     * 只需通过接口和注解滴啊用http api,spring Cloud Feign,整合 Ribbon 和 Hystrix
     * 基于注解,负载均衡,服务熔断等一系列功能
     *
     */
     
    ConfigCenter 配置中心
    /**
     * 本地仓库配置中心和远程Git仓库配置中心
     */
     
    Zipkin
    /**
     * Zipkin 是一个可以采集并且跟踪分布式系统中请求数据的组件,让开发者可以更加直观的监控到请求在各个
     * 微服务所消耗的时间等,Zipkin:Zipkin Server 、Zipkin Client
     */