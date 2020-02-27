package com.javaniuniu.aop.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Order(1)
public class AfterStartRunner implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void run(String... args) {
        logger.debug("after start debug...");
        logger.info("after start info...");
    }
}