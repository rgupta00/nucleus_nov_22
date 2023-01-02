package com.demo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
 public class Foo  {
    private String message;
    private Bar bar;

    public String getMessage() {
        return message;
    }
    public Bar getBar() {
        return bar;
    }
    @Value("some value")
    public void setMessage(String message) {
        this.message = message;
    }
    @Autowired
    public void setBar(Bar bar) {
        this.bar = bar;
    }
    public void printFooState(){
        System.out.println("message :"+ message);
        System.out.println( bar.getValue());;
    }

}


