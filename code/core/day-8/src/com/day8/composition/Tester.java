package com.day8.composition;

public class Tester {
    public static void main(String[] args) {
        Address address=new Address("A21","krishan nagar","110044");
        Employee employee=new Employee("raj",6000, address);
     //   employee.setAddress(address);
        System.out.println(employee);

    }
}
