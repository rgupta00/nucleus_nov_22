package com.day6.session1;
// Employee<>----Address
class Employee {
    private Integer id;
    private String name;
    private double salary;
    private Address address;

    public Employee(Integer id, String name, double salary,String houseNo, String address, String city, String pinCode) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = new Address("A12","krishan nagar" ,"delhi","110052");
    }


    public void printEmployeeDetails(){
        System.out.println("id: "+id+" name: "+ name+" salary: "+ salary+" address: ");
        address.printAddress();
    }
}
class Address{
    private String houseNo;
    private String address;
    private String city;
    private String pinCode;

    public Address(String houseNo, String address, String city, String pinCode) {
        this.houseNo = houseNo;
        this.address = address;
        this.city = city;
        this.pinCode = pinCode;
    }
    public void printAddress(){
        System.out.println("house no: "+ houseNo+" adress: "+ address+" city: "+ city+" pinCode: "+ pinCode);
    }
}

public class A_DemoAggigation {

    public static void main(String[] args) {

        //nteger id, String name, double salary, Address address
        Employee employee=new Employee(444, "raj",4456,"A12","krishan nagar" ,"delhi","110052");
        employee.printEmployeeDetails();

    }
}
