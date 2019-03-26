package com.atguigu.springcloud;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@MapperScan(value="com.atguigu.springcloud.dao")
@EnableCircuitBreaker//对hystrixR熔断机制的支持
@EnableDiscoveryClient

public class DeptProvider_hystric_8001_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_hystric_8001_App.class, args);
    }

}
