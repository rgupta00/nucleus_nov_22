package com.demo;

public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private double salary;
    private int choice;

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public int compareTo(Employee o) {
        if(choice==1){

        }
        return 0;
    }
}
