package com.demo4;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Random;

@Component
@Scope(value="prototype", proxyMode= ScopedProxyMode.TARGET_CLASS)
final public class Bar {
    private String time= LocalDateTime.now().toString();
    private int temp=new Random().nextInt(60);

    public String getValue() {
        return (time+ " : " + temp);
    }

}