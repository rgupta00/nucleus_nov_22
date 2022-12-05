package com.empapp;

import java.util.ArrayList;
import java.util.List;

interface MyIterator{
    boolean hasNext();
    Object next();
     void remove();
}
class Company {
    private List<Employee> employees;

    public Company() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee e){
        employees.add(e);
    }
    public MyIterator getMyIterator(){
        return new MyIteratorImpl();
    }
    class MyIteratorImpl implements MyIterator{
        int index=0;
        @Override
        public boolean hasNext() {
            return index<employees.size();
        }

        @Override
        public Object next() {
            return employees.get(index++);
        }

        @Override
        public void remove() {
            employees.remove(index--);
        }
    }
}
public class DemoIterator {
    public static void main(String[] args) {

        Company  company=new Company();
       company.addEmployee( new Employee(199,"raj",7000));
        company.addEmployee( new Employee(199,"raj",7000));
        company.addEmployee( new Employee(199,"raj",7000));
        company.addEmployee( new Employee(199,"raj",7000));

        MyIterator myIterator=company.getMyIterator();
        while (myIterator.hasNext()){
            System.out.println(myIterator.next());
        }
    }
}
