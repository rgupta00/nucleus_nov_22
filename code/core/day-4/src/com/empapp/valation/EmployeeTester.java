package com.empapp.valation;

import java.time.LocalDate;
import java.time.Month;

public class EmployeeTester {
    public static void main(String[] args) {
        /*
          public Employee(Integer id, String name, double salary, String phoneNumber,
                    String emailId, LocalDate dateOfBirth, String dept) {
         */
        Employee employee=
                new Employee(55444,"raj",78000,"9958543978","raj@gmail.com",
                        LocalDate.of(1979, Month.NOVEMBER,11),"IT");

        employee.print();
    }
}
