package com.day6.session1;

import java.util.LinkedList;
import java.util.List;

// 1             N
// Company<>------Emp
class  Emp{
    private  int id;
    private String name;
    private double salary;

    public Emp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void printEmp(){
        System.out.println("id: "+id+" name: "+ name+" salary: "+salary);
    }
//
}
class  Company{
    private String name;
    private List<Emp>emps;
    private int totalEmps;

    public Company(String name){
        this.name=name;
        this.emps=new LinkedList<>();
    }
    public  void addEmp(Emp e){
        totalEmps++;
        emps.add(e);
    }
    public void printCompanyDetails(){
        System.out.println("total no of emps: "+ totalEmps);
        System.out.println("name: "+ name);
        System.out.println("emp details");
        for (Emp e: emps){
           e.printEmp();
        }
    }
}
public class A_AnotherExOfCompositionAndAgg {
    public static void main(String[] args) {
        Company company=new Company("abc");
        company.addEmp(new Emp(1,":raj",7000));
        company.addEmp(new Emp(18,":ekta",7000));
        company.addEmp(new Emp(51,":tarun",7800));

        company.printCompanyDetails();

    }
}


