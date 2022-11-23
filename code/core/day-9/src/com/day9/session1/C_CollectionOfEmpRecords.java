package com.day9.session1;
import java.sql.Array;
import java.util.*;
public class C_CollectionOfEmpRecords {
    public static void main(String[] args) {

        List<Employee> list=new ArrayList<>();
        list.add(new Employee(881,"kapil",6000));
        list.add(new Employee(188,"gunika",9600));
        list.add(new Employee(1,"amit",8000));
        list.add(new Employee(17,"amit",9000));

        printList(list);
        Collections.sort(list);
        System.out.println("------employee sorted as per Id--------");
        printList(list);

        //hey java i want to sort as per EmployeeSorterAsPerName logic

        Collections.sort(list, new EmployeeSorterAsPerName());
        System.out.println("------employee sorted as per name--------");
        printList(list);

        //hey java i want to sort as per EmployeeSorterAsPerSalary
        Collections.sort(list, new EmployeeSorterAsPerSalary());

        System.out.println("------employee sorted as per salary--------");
        printList(list);

        //EmployeeSorterAsPerNameThenAsPerSalary
        Collections.sort(list, new EmployeeSorterAsPerNameThenAsPerSalary());

        System.out.println("------employee sorted as per name and then as per salary--------");
        printList(list);


    }

     static void printList(List<Employee> list) {
        Iterator<Employee>it= list.iterator();
        System.out.println("-------------------------");
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}






