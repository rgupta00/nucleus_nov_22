package com.productapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.productapp.web"})
public class WebConfig {

    /*
     <mvc:resources location="/resources/" mapping="/resources/**"/>

    <bean id="encoder" class="org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder">
        <constructor-arg value="12" />
    </bean>
     */
    @Bean
    public InternalResourceViewResolver internalResourceViewResolver(){
        InternalResourceViewResolver ir=new InternalResourceViewResolver();
        ir.setPrefix("/WEB-INF/views/");
        ir.setSuffix(".jsp");
        return ir;
    }
}