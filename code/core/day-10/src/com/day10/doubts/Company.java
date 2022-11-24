package com.day10.doubts;
import com.day10.session1.EmpType;

import java.util.*;
public class Company {
    private String companyName;
    private static int empCounter=0;
    private final int SIZE=10;
    private int index=-1;
    private Emp[]emps;
    public Company(String companyName){
        this.companyName=companyName;
        emps=new Emp[SIZE];//ie we have array to hold 10 emp but right now no emp in that array

    }
    public Emp getEmpById(int id) throws EmpNotFoundException {
        boolean isFound=false;
        int i=0;
        for (i=0;i<empCounter; i++){
            Emp temp=emps[i];
            if(temp.getId()==id){
                isFound=true;
                break;
            }
        }
        if(!isFound)
            throw new EmpNotFoundException("emp with id "+ id + " not found");
        return emps[i];
    }
    public void addEmp( String name, double salary, EmpType empType){
        index++;
        if(index==SIZE-1){
            System.out.println("------");
        }else {
            emps[index]=new Emp(++empCounter, name, salary, empType);
        }
    }

    public void printEmps(){
        int i=0;
        for (Emp emp: emps  ){
            if(i>=empCounter)
                break;
            System.out.println(emp);
            i++;
        }
    }

}
