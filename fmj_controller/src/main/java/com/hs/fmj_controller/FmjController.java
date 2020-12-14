package com.hs.fmj_controller;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @author Huasheng
 */
@EnableDubbo
@EnableOpenApi
@CrossOrigin
@SpringBootApplication
@MapperScan("com.hs.fmj_service")
public class FmjController {

    public static void main(String[] args) {
        SpringApplication.run(FmjController.class, args);
    }

}
