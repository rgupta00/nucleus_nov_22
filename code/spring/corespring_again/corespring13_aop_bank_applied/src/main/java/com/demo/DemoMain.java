package com.demo;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DemoMain {

    private static Logger logger= LogManager.getLogger(DemoMain.class);
    public static void main(String[] args) {
        System.out.println("it is a old way :(");
       logger.info("this is a logging hello word");
       String data="121A";
       try{
           Integer val=Integer.parseInt(data);
       }catch (Exception e){
           logger.error("error "+ e);
       }

       logger.debug("this is a debug message");
    }
}
