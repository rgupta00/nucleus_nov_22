package com.demo;

public class Employee {
    private  int id;
    private String name;
    private double salary;
    private boolean permanent;

    public Employee(int id, String name, double salary, boolean permanent) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.permanent = permanent;
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

    public boolean isPermanent() {
        return permanent;
    }

    public void setPermanent(boolean permanent) {
        this.permanent = permanent;
    }

    public Employee() {}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append(", permanent=").append(permanent);
        sb.append('}');
        return sb.toString();
    }
}
