package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author liudongrong
 * @date 2019/2/10 16:53
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.ladtor.workflow.task", "com.example.demo"})
public class WorkFlowTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(WorkFlowTestApplication.class);
    }
}
