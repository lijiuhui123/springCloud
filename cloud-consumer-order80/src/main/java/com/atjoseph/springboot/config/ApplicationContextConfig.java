package com.atjoseph.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * <p> 描述: RestTemplate 是 Spring 提供的用于访问 Rest 服务的客户端库。它提供了一套接口，然后分别用三种 Java 最常用 Http 连接的库来分别实现这套接口：  JDK 自带的 HttpURLConnection Apache 的 HttpClient OKHttp3 </p>
 * <p> 创建时间 : 2023/1/12 11:20 </p>
 *
 * @author : Joseph
 * @version : v1.0
 */
@Configuration
public class ApplicationContextConfig {
    @Bean // 容器:类似于applicationContext.xml中的<bean id="" class="" />
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
