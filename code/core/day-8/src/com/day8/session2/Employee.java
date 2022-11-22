package com.day8.session2;

class Employee extends Object implements Cloneable{
    private int id;
    private String name;
    private double salary;

    private static int empCounter=0;

    public Employee( String name, double salary){
        this.id = +empCounter;
        this.name = name;
        this.salary = salary;

    }
//
//
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("finalize is called");
//        super.finalize();
//        while(true){
//
//        }

   // }
}
