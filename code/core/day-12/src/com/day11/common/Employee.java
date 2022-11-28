package com.day11.common;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private double salary;

    public Employee( int id, String name, double salary){
	this.id=id;
        this.name = name;
        this.salary = salary;

    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Employee employee = (Employee) o;

        if (id != employee.id)
            return false;
        if (Double.compare(employee.salary, salary) != 0)
            return false;
        return name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return name.length();
    }

    @Override
    public int compareTo(Employee o) {
        return this.getName().compareTo(o.getName());
    }
}
