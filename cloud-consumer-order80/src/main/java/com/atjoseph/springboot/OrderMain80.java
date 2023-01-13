package com.atjoseph.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <p> 描述: 编辑订单主启动类 </p>
 * <p> 创建时间 : 2023/1/12 10:43 </p>
 *
 * @author : Joseph
 * @version : v1.0
 */
@EnableEurekaClient
@SpringBootApplication
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }
}
