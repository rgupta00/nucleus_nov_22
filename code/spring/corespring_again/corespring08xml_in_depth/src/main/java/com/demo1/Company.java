package com.demo1;
import java.util.*;
public class Company {
    private String companyName;
    private int empCount;
    private List<String>locations;
    private Set<Employee> employees;


    public String getCompanyDetails() {
        final StringBuilder sb = new StringBuilder("Company{");
        sb.append("companyName='").append(companyName).append('\'');
        sb.append(", empCount=").append(empCount);
        sb.append(", locations=").append(locations);
        sb.append(", employees=").append(employees);
        sb.append('}');
        return sb.toString();
    }

    public Company() {}


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getEmpCount() {
        return empCount;
    }

    public void setEmpCount(int empCount) {
        this.empCount = empCount;
    }

    public List<String> getLocations() {
        return locations;
    }

    public void setLocations(List<String> locations) {
        this.locations = locations;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }


}
