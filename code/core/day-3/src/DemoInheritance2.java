class Emp{
    private  int id;
    private String name;
    private double salary;

    public Emp(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public  void show(){
        System.out.println("id: "+ id);
        System.out.println("name: "+ name);
        System.out.println("salary:"+ salary);
    }
}
class FullTimeEmp extends Emp{
    private String ppfNo;
    public FullTimeEmp(int id, String name, double salary, String ppfNo){
        super(id, name, salary);
        this.ppfNo=ppfNo;
    }
    public  void show(){
       super.show();
        System.out.println("ppf no: "+ ppfNo);
    }
}

class PartTimeEmp extends Emp{
    private int noOfDaysWork;
    private double payPerDay;

    public PartTimeEmp(int id, String name, double salary, int noOfDaysWork,
     double payPerDay){
        super(id, name, salary);
        this.noOfDaysWork=noOfDaysWork;
        this.payPerDay=payPerDay;
    }
    public  void show(){
        super.show();
        System.out.println("noOfDaysWork: "+ noOfDaysWork);
        System.out.println("payPerDay: "+ payPerDay);
    }
}

public class DemoInheritance2 {

    public static void main(String[] args) {
        // public FullTimeEmp(int id, String name, double salary, String ppfNo)
        FullTimeEmp fullTimeEmp=new FullTimeEmp(4, "ravi",4000, "AB3333");
        fullTimeEmp.show();
    }
}
