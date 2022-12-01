package com.day1.session1.common;

public class EmpDto {
    private  String name;
    private double netSalary;

    public EmpDto(String name, double netSalary) {
        this.name = name;
        this.netSalary = netSalary;
    }

    public String getName() {
        return name;
    }


    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EmpDto{");
        sb.append("name='").append(name).append('\'');
        sb.append(", netSalary=").append(netSalary);
        sb.append('}');
        return sb.toString();
    }
}
