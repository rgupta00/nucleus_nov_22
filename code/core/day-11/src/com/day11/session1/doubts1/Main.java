package com.day11.session1.doubts1;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        CompanyWithMap company=new CompanyWithMap("nu softwae");

        company.addEmp("raj",1000);
        company.addEmp("aaa",1000);

        Map<Integer, Employee> empMap=company.getEmployeesMap();

        //    why it not make empMap null\
        //empMap=null;

       empMap.put(44,new Employee("raj",7000));

        company.printEmployee();





//        Company company=new Company("nu software");
//        company.addEmp("raj",5000);
//        company.addEmp("raj",5000);
//        company.addEmp("raj",5000);
//        company.printEmployee();
//
//        Employee[] employees=company.getEmployees();
//        employees=null;

    }
}
