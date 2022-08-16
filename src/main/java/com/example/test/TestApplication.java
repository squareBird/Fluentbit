package com.example.test;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(TestApplication.class);


    public static void main(String[] args) {

        logger.info("Hello logback");

        SpringApplication.run(TestApplication.class, args);
    }

}
