package com.day10.doubts;

import com.day10.session1.EmpType;

public class EmpTester {
    public static void main(String[] args) {
        System.out.println("-----------");
        Company company=new Company("nu tech");

        company.addEmp("rajiv",7770, EmpType.FTime);
        company.addEmp("reena",7770, EmpType.FTime);
        company.addEmp("amit",7770, EmpType.FTime);
        company.addEmp("ganga",7770, EmpType.FTime);
        company.addEmp("umesh",7770, EmpType.FTime);
        company.addEmp("pooja",7770, EmpType.FTime);

      //  company.printEmps();
        try {
            Emp emp = company.getEmpById(200);
            System.out.println(emp);
        }catch (EmpNotFoundException e){
            System.out.println(e.getMessage());
        }



    }
}
