package com.spring.springboot;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AA {


    public static final Logger logger = LoggerFactory.getLogger(AA.class);

    public static void main(String[] args) {

        logger.debug("test=====A=====debug-log");
        logger.info("test=====A=====info-log");
        logger.warn("test=====A=====warn-log");
        logger.error("test=====A=====errro-log");
    }
}
