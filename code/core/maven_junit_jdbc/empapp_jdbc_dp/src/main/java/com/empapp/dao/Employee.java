package com.empapp.dao;
import  java.util.*;
//DTO-- table
public class Employee {
    private  int eid;
    private String name;
    private double salary;
    private List<Project> projects;

    public List<Project> getProjects() {
        return projects;
    }

    public Employee(int eid, String name, double salary) {
        this.eid = eid;
        this.name = name;
        this.salary = salary;
        this.projects=new ArrayList<>();
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee() {}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("eid=").append(eid);
        sb.append(", name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}
