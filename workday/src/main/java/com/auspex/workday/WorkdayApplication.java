package com.auspex.workday;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.auspex.workday.dao.mapper")
public class WorkdayApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkdayApplication.class, args);
    }

}
