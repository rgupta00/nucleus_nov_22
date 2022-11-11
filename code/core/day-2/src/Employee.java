public class Employee {
   private int employeeId;
    private String employeeName;
    private double employeeSalary;
    //default ctr
     public Employee(){}
    //para
     public Employee(int employeeId, String employeeName, double employeeSalary){
         this.employeeId=employeeId;
         this.employeeName=employeeName;
         this.employeeSalary=employeeSalary;
     }
     //copy ctr
     public Employee(Employee employee){
         this.employeeId=employee.employeeId;
         this.employeeName=employee.employeeName;
         this.employeeSalary=employee.employeeSalary;
     }
    public void changeSalary(double employeeSalary){
         if(this.employeeSalary<employeeSalary)
             this.employeeSalary=employeeSalary;
         else
             System.out.println("change is not permittable");

    }
    public int getEmployeeId(){
        return  this.employeeId;
    }
    public String getEmployeeName(){
        return this.employeeName;
    }
    public double getEmployeeSalary(){
        return  this.employeeSalary;
    }

    public void printEmployeeDetails(){
        System.out.println
                ("employeeId :"+ employeeId+" employeeName: "
                        +employeeName+" employeeSalary: "+employeeSalary);
    }
}
