package com.doubts;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnn{
    public String info() default  "some default value";
}
class MyData{
    @MyAnn(info = "we are all champs")
    void demo(){
        System.out.println("demo method..");
    }

}
public class DemoAnnoAndReflection {
    public static void main(String[] args) throws ClassNotFoundException{
        //3 annotation process karna
        Class<?>clazz=Class.forName("com.doubts.MyData");
        Method[]methods=clazz.getDeclaredMethods();
        for (Method  method: methods){
            if(method.isAnnotationPresent(MyAnn.class)){
                MyAnn myAnn=method.getAnnotation(MyAnn.class);
                System.out.println(myAnn.info());
            }
        }
        System.out.println("---------");
    }
}
