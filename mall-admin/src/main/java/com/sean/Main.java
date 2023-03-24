package com.sean;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zengyusheng
 * @date ${DATE} ${TIME}
 */
@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
}