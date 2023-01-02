package com.demo2;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Random;

@Component
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Bar {

    private String time= LocalDateTime.now().toString();
    private int temp=new Random().nextInt(60);

    public String getValue() {
        return (time+ " : " + temp);
    }

}