package com.fengmang.cleanlogs.cleanadjiangsulogs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CleanAdJiangsuLogsApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(CleanAdJiangsuLogsApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CleanAdJiangsuLogsApplication.class);
    }
}
