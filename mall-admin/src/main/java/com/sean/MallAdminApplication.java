package com.sean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;

/**
 * @author zengyusheng
 * @date 2023/03/04
 */
@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
public class MallAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallAdminApplication.class,args);
    }
}