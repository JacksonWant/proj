package com.jackson.seckill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jackson.seckill.mapper")
public class SeckillDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(SeckillDemo1Application.class, args);
    }

}
