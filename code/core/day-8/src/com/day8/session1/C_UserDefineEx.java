package com.day8.session1;
class EmployeeCreationException extends Exception{
    public EmployeeCreationException(String message) {
        super(message);
    }
}
class Employee{
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary)throws EmployeeCreationException {
        this.id = id;
        this.name = name;
        this.salary = salary;
        if(id<0 || name.length()==0||salary<4000){
            throw  new EmployeeCreationException("invalid data");
        }
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
}
public class C_UserDefineEx {
    public static void main(String[] args) {
        try {
            extracted();
        } catch (EmployeeCreationException e) {
            throw new RuntimeException(e);
        }
    }

    private static void extracted()throws EmployeeCreationException {

           // Employee employee = new Employee(-1, "raj", 4000);

            Employee employees[]={new Employee(1, "raj", 4000), new Employee(1, "raj", 4000), new Employee(1, "raj", 4000)};
            //employees[0]=new Employee(1, "raj", 4000);
            for (Employee e: employees){
                System.out.println(e.toString());
            }
          //  System.out.println(employee);

    }
}
