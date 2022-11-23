package com.day9.session1;
import  java.util.*;
class AccountSortByNameThenByBalance implements Comparator<Account>{
    @Override
    public int compare(Account o1, Account o2) {
        int value= o1.getName().compareTo(o2.getName());
        if (value==0){
            value=Double.compare(o2.getSalary(), o1.getSalary());
        }
        return value;
    }
}
class AccountSortByAccountHolderName implements Comparator<Account>{
    @Override
    public int compare(Account o1, Account o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class Account implements Comparable<Account>{
    private int id;
    private String name;
    private double salary;

    public Account(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Account o) {
        return Integer.compare(this.id, o.id);
    }
}
public class YetAnotherExOfComparableAndComprator {
    public static void main(String[] args) {



        List<Account> accounts=new ArrayList<>();
        accounts.add(new Account(1,"ekta",7000));
        accounts.add(new Account(18,"ekta",7009));
        accounts.add(new Account(17,"gunika",9000));
        System.out.println("all accounts");
        printAllAccounts(accounts);

        Collections.sort(accounts);
        System.out.println("all accounts---sorted as per id----");
        printAllAccounts(accounts);

        Collections.sort(accounts, new AccountSortByAccountHolderName());
        System.out.println("all accounts---sorted as per name----");
        printAllAccounts(accounts);

        //AccountSortByNameThenByBalance
        Collections.sort(accounts, new AccountSortByNameThenByBalance());
        System.out.println("all accounts---sorted as per name and then as per balane(rev)----");
        printAllAccounts(accounts);

        //

//
//        Collections.sort(accounts,(Account o1, Account o2) ->{
//                return Integer.compare(o1.getId(), o2.getId());
//
//        });

    }


     static void printAllAccounts(List<Account> accounts) {
        Iterator<Account> iterator = accounts.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
