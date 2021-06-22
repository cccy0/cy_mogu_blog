package com.github.cccy0.mogublog.picture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableTransactionManagement
@SpringBootApplication
@EnableOpenApi
@EnableDiscoveryClient
@EnableFeignClients("com.github.cccy0.mogublog.commons.feign")
@ComponentScan(basePackages = {
        "com.github.cccy0.mogublog.commons.config.feign",
        "com.github.cccy0.mogublog.commons.handler",
        "com.github.cccy0.mogublog.commons.config.redis",
        "com.github.cccy0.mogublog.utils",
        "com.github.cccy0.mogublog.picture"})
public class PictureApplication {

    public static void main(String[] args) {
        SpringApplication.run(PictureApplication.class, args);
    }
}
