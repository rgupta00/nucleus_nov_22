package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 <context:annotation-config/><!--hey spring i will go for annotation -->
    <context:component-scan base-package="com.demo"/> <!--i this package w will get the anno-->
 */
@Configuration
@ComponentScan(basePackages = {"com.demo"})
public class AppConfig {
}
