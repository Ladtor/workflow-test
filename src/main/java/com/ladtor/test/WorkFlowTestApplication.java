package com.ladtor.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author liudongrong
 * @date 2019/2/10 16:53
 */
@SpringBootApplication
@ComponentScan("com.ladtor.workflow.task")
public class WorkFlowTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(WorkFlowTestApplication.class);
    }
}
