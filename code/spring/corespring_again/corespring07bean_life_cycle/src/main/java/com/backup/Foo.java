package com.backup;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Foo implements InitializingBean, DisposableBean {
    private String name;

    public Foo(){
        System.out.println("i am ctr");
    }

    @PostConstruct
    public void foo(){
        System.out.println("it is init method annotation wala");
    }

    @PreDestroy
    public void bar(){
        System.out.println("it is destroy method annotation wala");
    }

    //callback method ie progmmer just define it framework will call it
    //Life cycle method /callback must not take any parameter nor return some values
  public void myInit(){
        System.out.println("it is init method using xml");
    }

   public void myDestroy(){
        System.out.println("it is destory method using xml");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("i am setName");
        this.name = name;
    }
    public void doWork(){
        System.out.println("doing work..."+ name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("it is called before bean is dostoyre  inteface wala: DisposableBean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("it is called after bean is init inteface wala:InitializingBean");
    }
}
