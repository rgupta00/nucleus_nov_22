package com.bankapp;

import lombok.*;

import java.util.Objects;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
class Emp{
    private int id;
    private String name;
    private double salary;
    private String address;
}
public class Demo {
    public static void main(String[] args) {

        Emp  emp=new Emp();
        Emp e= Emp.builder().address("demo").salary(3400).build();
        System.out.println(e);
    }
}
