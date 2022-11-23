package com.day10.session1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//Comparable vs Comparator
public class A_BasicOfCollectionWithUserDefineOb {
    public static void main(String[] args) {

        List<Emp> list=new ArrayList<>();
        list.add(new Emp(8881,"tarun",4000,EmpType.PTime));

        list.add(new Emp(187,"raj",5000,EmpType.FTime));
        list.add(new Emp(17,"seema",8000,EmpType.PTime));

        System.out.println("----list of emp------");
        printEmpList(list);

        Collections.sort(list);

        System.out.println("----list of emp sorted as per name------");
        printEmpList(list);

        System.out.println("----list of emp sorted as per salary ");
        Collections.sort(list  , new EmpAsPerSalary());
        printEmpList(list);

    }

    private static void printEmpList(List<Emp> list) {
        Iterator<Emp> it= list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

}
