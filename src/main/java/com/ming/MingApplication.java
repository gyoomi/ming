package com.ming;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/9/25 14:24
 */
@SpringBootApplication
@MapperScan(basePackages = "com.ming.*.*.mapper")
public class MingApplication {

    public static void main(String[] args) {
        SpringApplication.run(MingApplication.class, args);
    }
}
