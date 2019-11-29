package com.gosuncn.esdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EsdemoApplication {

    private static final Logger logger = LoggerFactory.getLogger(EsdemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(EsdemoApplication.class, args);
        logger.warn("启动完毕。。。");
    }

}
