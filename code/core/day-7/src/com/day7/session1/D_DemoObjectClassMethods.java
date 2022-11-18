package com.day7.session1;

import java.util.SortedMap;

class Emp implements Cloneable{
    private Integer id;
    private String name;
    private double salary;

    public Emp(Integer id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    //toString


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Emp emp = (Emp) o;

        if (Double.compare(emp.salary, salary) != 0)
            return false;
        if (!id.equals(emp.id))
            return false;
        return name.equals(emp.name);
    }

    @Override
    public int hashCode() {
        return name.length();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Emp{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }

    //call back method
    @Override
    protected void finalize() throws Throwable {
        System.out.println("hello gc have clammed object");
        super.finalize();
    }
}

public class D_DemoObjectClassMethods {
    public static void main(String[] args)throws CloneNotSupportedException {
        System.out.println(Runtime.getRuntime().availableProcessors());
        Emp e1=new Emp(5,"raj",6000);
        //System.gc();//it is a req hey gc come on and do gc
        Runtime.getRuntime().gc();//both same
        e1=null;
        System.out.println("end");
//        Emp e2=(Emp)e1.clone();
//
//        System.out.println(e1);
//        System.out.println(e2);

//        Emp e2=new Emp(5,"raj",6000);
//
//        if(e1.equals(e2)){
//            System.out.println("are same");
//        }else
//            System.out.println("are not same");
//        System.out.println(e1.getClass());//java reflection*
    }
}
