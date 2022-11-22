package com.day9.session1;
import java.util.*;
class EmpAsPerName implements Comparator<Emp>{

    @Override
    public int compare(Emp o1, Emp o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class Emp implements Comparable<Emp>{
    private int id;
    private String name;

    public Emp(int id, String name) {
        this.id = id;
        this.name=name;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Emp{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Emp o) {
        return Integer.compare(this.getId(), o.getId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Emp emp = (Emp) o;

        if (id != emp.id) return false;
        return name.equals(emp.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        return result;
    }
}
public class H_QForYou {
    public static void main(String[] args) {
        /*
        in case of HashSet
----------
if u are inserting user define object eg emps
then Emp class must imp equals and hashcode
otherwise you will not get your data way...


in case of TreeSet
----------
if u are inserting user define object eg emps
then Emp class must imp Comparable or commparator
otherwise you will CCEx

         */
        Set<Emp> emps=new HashSet<>();
        emps.add(new Emp(388,"ekta"));
        System.out.println(emps.contains(new Emp(388,"ekta")));
        //emps.add(new Emp(3,"raj"));
       // emps.add(new Emp(83,"suman"));



//
//        Iterator<Emp> it=emps.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

        //set --> sortedSet
//        List<String> set=new ArrayList<>();
//        set.add("foo");
//        set.add("bar");
//        set.add("car");
//        set.add("car");
//
//        Set<String> set2=new TreeSet<>(set);
//        System.out.println(set2);

    }
}
