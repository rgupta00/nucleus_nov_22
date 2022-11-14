import java.time.LocalDate;

public class Employee {
    private  int id;
    private String name;
    private double salary;
    private LocalDate dateOfBirth;

    private static int employeeCounter=0;

    //non static method can access this , static methnod can not access this
    public static int getEmployeeCounter(){
        return employeeCounter;
    }
   // public Employee(){}
    public Employee( String name, double salary, LocalDate dateOfBirth) {
        this.id = ++employeeCounter;
        this.name = name;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
    }

    public  void printEmployeeDetails(){
        System.out.println("----------------------");
        System.out.println("id: "+ id);
        System.out.println("name: "+ name);
        System.out.println("salary: "+ salary);
        System.out.println("dob: "+ dateOfBirth);
        System.out.println("----------------------");
    }
}
