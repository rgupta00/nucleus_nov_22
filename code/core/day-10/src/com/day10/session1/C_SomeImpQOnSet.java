package com.day10.session1;
import  java.util.*;
public class C_SomeImpQOnSet {
    public static void main(String[] args) {
        //Set: HashSet, LinkedHashSet, TreeSet
        Set<Emp> set=new HashSet<>();//HashMap
        set.add(new Emp(8881,"tarun",4000,EmpType.PTime));

        set.add(new Emp(187,"raj",5000,EmpType.FTime));
        set.add(new Emp(17,"seema",8000,EmpType.PTime));

        System.out.println(set.contains(new Emp(8881,"tarun",4000,EmpType.PTime)));
//
//        Iterator<Emp> it=set.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

//        Set<Emp> set=new TreeSet<>(new Comparator<Emp>() {
//            @Override
//            public int compare(Emp o1, Emp o2) {
//                return Double.compare(o2.getSalary(), o1.getSalary());
//            }
//        });
//        set.add(new Emp(8881,"tarun",4000,EmpType.PTime));
//
//        set.add(new Emp(187,"raj",5000,EmpType.FTime));
//        set.add(new Emp(17,"seema",8000,EmpType.PTime));
//
//
//        Iterator<Emp> it=set.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }





//        Set<String> set=new TreeSet<>();
//        set.add("foo");
//        set.add("tarun");
//       // set.add(new StringBuilder("bar"));
//        set.add("jar");
//        System.out.println(set);


    }
}
