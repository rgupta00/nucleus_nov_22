import java.time.LocalDate;
import java.time.Month;

public class EmployeeTester {
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(1980, Month.NOVEMBER, 24);

        Employee e=new Employee( "raj",6000, date);

       e.printEmployeeDetails();



        LocalDate date2=LocalDate.of(2000, Month.NOVEMBER, 24);

        Employee e2=new Employee( "sumit",6000, date);

        e2.printEmployeeDetails();
        System.out.println(Employee.getEmployeeCounter());


    }
}