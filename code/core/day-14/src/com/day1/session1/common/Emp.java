package com.day1.session1.common;

public class Emp {
    private  int id;
    private String name;
    private double hra;
    private double ta;
    private double da;
    private double commission;
    private double carAllowencce;
    private double reallocation;
    private double monthlySalary;

    public Emp(int id, String name, double hra, double ta, double da, double commission,
               double carAllowencce, double reallocation, double monthlySalary) {
        this.id = id;
        this.name = name;
        this.hra = hra;
        this.ta = ta;
        this.da = da;
        this.commission = commission;
        this.carAllowencce = carAllowencce;
        this.reallocation = reallocation;
        this.monthlySalary = monthlySalary;
    }

    public double netSalaray(){
        return (hra+ta+da+commission+carAllowencce+reallocation+monthlySalary)*0.8;
    }
    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public double getTa() {
        return ta;
    }

    public void setTa(double ta) {
        this.ta = ta;
    }

    public double getDa() {
        return da;
    }

    public void setDa(double da) {
        this.da = da;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getCarAllowencce() {
        return carAllowencce;
    }

    public void setCarAllowencce(double carAllowencce) {
        this.carAllowencce = carAllowencce;
    }

    public double getReallocation() {
        return reallocation;
    }

    public void setReallocation(double reallocation) {
        this.reallocation = reallocation;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Emp{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", hra=").append(hra);
        sb.append(", ta=").append(ta);
        sb.append(", da=").append(da);
        sb.append(", commission=").append(commission);
        sb.append(", carAllowencce=").append(carAllowencce);
        sb.append(", reallocation=").append(reallocation);
        sb.append(", monthlySalary=").append(monthlySalary);
        sb.append('}');
        return sb.toString();
    }
}
