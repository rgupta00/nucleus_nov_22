package com.demo2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
 public class Foo  {

    @Autowired
    private ApplicationContext applicationContext;

    private String message;
    private Bar bar;

    public String getMessage() {
        return message;
    }

    public Bar getBar() {
        return bar();
    }

    public Bar bar(){
      return  bar=applicationContext.getBean("bar",Bar.class);
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
        bar=getBar();
        System.out.println( bar.getValue());;
    }

}


