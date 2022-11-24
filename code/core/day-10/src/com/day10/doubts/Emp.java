package com.day10.doubts;

import com.day10.session1.EmpType;


final public class Emp implements Comparable<Emp>{
    private int id;
    private String name;
    private double salary;
    private EmpType empType;

    public Emp(int id, String name, double salary, EmpType empType) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.empType = empType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Emp{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append(", empType=").append(empType);
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public EmpType getEmpType() {
        return empType;
    }

    public void setEmpType(EmpType empType) {
        this.empType = empType;
    }

    //e1.compareTo(e2) : jvm will call this method , call back methods
    @Override
    public int compareTo(Emp o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Emp emp = (Emp) o;

        if (id != emp.id) return false;
        if (Double.compare(emp.salary, salary) != 0) return false;
        if (!name.equals(emp.name)) return false;
        return empType == emp.empType;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + name.hashCode();
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + empType.hashCode();
        return result;
    }
}
