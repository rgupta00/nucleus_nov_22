package com.day8.composition;

class Employee {
    private int id;
    private String name;
    private double salary;

    private Address address;

    private static int empCounter=0;


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee(String name, double salary, String houseNo, String addressLine, String pinCode){
        this.id = +empCounter;
        this.name = name;
        this.salary = salary;

        this.address=new Address(houseNo, addressLine, pinCode);
    }
//
//


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append(", address=").append(address);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Employee employee = (Employee) o;

        if (id != employee.id)
            return false;
        if (Double.compare(employee.salary, salary) != 0)
            return false;
        return name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return name.length();
    }


}
