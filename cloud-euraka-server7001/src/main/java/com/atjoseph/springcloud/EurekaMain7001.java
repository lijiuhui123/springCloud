package com.atjoseph.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p> 描述: Eureka主启动类 </p>
 * <p> 创建时间 : 2023/1/13 14:45 </p>
 *
 * @author : Joseph
 * @version : v1.0
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class, args);
    }
}
