package com.bankapp.controller;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class DemoLogging {
    private static Logger logger=LogManager.getLogger(DemoLogging.class);

    public static void main(String[] args) {
        logger.info("hello world logging");
    }
}
