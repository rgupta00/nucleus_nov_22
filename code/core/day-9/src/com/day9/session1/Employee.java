package com.day9.session1;

import java.util.Comparator;

//Compartor vs Comparable
class EmployeeSorterAsPerNameThenAsPerSalary implements Comparator<Employee>{
    @Override
    public int compare(Employee e1, Employee e2) {
         int value=e1.getName().compareTo(e2.getName());
         if(value==0){
             value=Double.compare(e2.getSalary(), e1.getSalary());
         }
         return value;
    }
}

class EmployeeSorterAsPerName implements Comparator<Employee>{
    @Override
    public int compare(Employee e1, Employee e2) {

        return e1.getName().compareTo(e2.getName());
    }
}
class EmployeeSorterAsPerSalary implements Comparator<Employee>{
    @Override
    public int compare(Employee e1, Employee e2) {

        return Double.compare(e2.getSalary(),e1.getSalary());
    }
}

class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private double salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(int id, String name, double salary){
	this.id=id;
        this.name = name;
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
      //  System.out.println("java will it");
        return Integer.compare(this.id, o.id);
    }
}
