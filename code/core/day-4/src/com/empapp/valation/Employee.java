package com.empapp.valation;

import java.time.LocalDate;

public class Employee {
    private Integer id; //5 digits
    private String name;// should not be null
    private double salary;//should not be null > 56000
    private String phoneNumber;//...
    private String emailId;
    private LocalDate dateOfBirth;
    private String dept;//IT, SALES, HR

    private boolean isValidDate=true;
    public Employee(Integer id, String name, double salary, String phoneNumber,
                    String emailId, LocalDate dateOfBirth, String dept) {
        if(Validation.isValidId(id)) {
            this.id = id;
        }
        this.name = name;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.dateOfBirth = dateOfBirth;
        this.dept = dept;
    }
    public  Employee(){}

    public Integer getId() {
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
    /*
    nteger id, String name, double salary, String phoneNumber,
                    String emailId, LocalDate dateOfBirth, String dept
     */
    public  void print(){
        System.out.println("--------------------");
        System.out.println("id: "+ id);
        System.out.println("name: "+ name);
        System.out.println("salary: "+ salary);
        System.out.println("phoneNumber: "+ phoneNumber);
        System.out.println("emailId: "+ emailId);
        System.out.println("dateOfBirth: "+ dateOfBirth);
        System.out.println("dept: "+ dept);

        System.out.println("--------------------");
    }
}