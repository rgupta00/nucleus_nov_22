package com.day11.session2;

import com.day11.common.Employee;

//generic class
class Data<T>{
    T i;

    public T getI() {
        return i;
    }

    public void setI(T i) {
        this.i = i;
    }
}
public class F_DemoGen2 {
    public static void main(String[] args) {
        Data<Employee> d=new Data<>();
        d.setI(new Employee(1,"raj",700));
        System.out.println(d.getI());
    }
}
