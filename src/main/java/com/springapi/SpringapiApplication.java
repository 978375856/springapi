package com.springapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.springapi.dao")
public class SpringapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringapiApplication.class, args);
    }

}
