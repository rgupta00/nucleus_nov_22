package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*


 */
@Configuration      // <context:annotation-config/>
@ComponentScan(basePackages = {"com.demo"}) //<context:component-scan base-package="com.demo"/>
public class AppConfig {
}
