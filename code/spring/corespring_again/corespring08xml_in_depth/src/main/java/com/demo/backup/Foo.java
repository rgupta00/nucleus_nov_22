package com.demo.backup;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//Bean: any object whose lifecyle is mainted by spring frameowrk
//spring container vs tomcat vs hibernate (entity)
public class Foo implements InitializingBean, DisposableBean, BeanNameAware {
    private String name;

    public Foo(){
        System.out.println("ctr of foo is called");
    }
    @PostConstruct
    public void initAnno(){
        System.out.println("init of foo anno wals");
    }

    @PreDestroy
    public void destroyAnno(){
        System.out.println("destroy of foo anno wals");
    }

    public void initXml(){
        System.out.println("init of foo xml wals");
    }

    public void destroyXml(){
        System.out.println("destroy of foo xml wals");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setname of foo is called");
        this.name = name;
    }

    public void doWork(){
        System.out.println("doing work by Foo bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init interface wala InitializingBean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destory interface wala DisposableBean");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("bean is created with the name "+ name);
    }
}
