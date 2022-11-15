
interface Payable{
    public abstract  double getPay();
}
class Consulant implements Payable{
    private  String consultantRegNo;
    private  String consultantPanCad;
    private String assignmentName;
    private double pricePerDay;
    private int noOfDays;

    public Consulant(String consultantRegNo, String consultantPanCad, String assignmentName, double pricePerDay, int noOfDays) {
        this.consultantRegNo = consultantRegNo;
        this.consultantPanCad = consultantPanCad;
        this.assignmentName = assignmentName;
        this.pricePerDay = pricePerDay;
        this.noOfDays = noOfDays;
    }

    public  void show(){
        System.out.println("consultantRegNo: "+ consultantRegNo);
        System.out.println("consultantPanCad: "+ consultantPanCad);
        System.out.println("assignmentName: "+ assignmentName);
        System.out.println("pricePerDay: "+ pricePerDay);
        System.out.println("noOfDays: "+ noOfDays);
    }

    @Override
    public double getPay() {
        return pricePerDay * noOfDays;
    }
}

abstract  class Emp implements  Payable{
    private  int id;
    private String name;

    public Emp(int id, String name){
        this.id=id;
        this.name=name;
    }


    public  void show(){
        System.out.println("id: "+ id);
        System.out.println("name: "+ name);
    }
    public abstract  double getPay();
}

class FullTimeEmp extends Emp{
    private String ppfNo;
    private  double salary;
    public FullTimeEmp(int id, String name, double salary, String ppfNo){
        super(id, name);
        this.salary=salary;
        this.ppfNo=ppfNo;
    }
    public  void show(){
       super.show();
        System.out.println("salary: "+ salary);
        System.out.println("ppf no: "+ ppfNo);
    }

    @Override
    public double getPay() {
        return salary*0.7;
    }
}

class PartTimeEmp extends Emp{
    private int noOfDaysWork;
    private double payPerDay;

    public PartTimeEmp(int id, String name, double salary, int noOfDaysWork,
     double payPerDay){
        super(id, name);
        this.noOfDaysWork=noOfDaysWork;
        this.payPerDay=payPerDay;
    }
    public  void show(){
        super.show();
        System.out.println("noOfDaysWork: "+ noOfDaysWork);
        System.out.println("payPerDay: "+ payPerDay);
    }

    @Override
    public double getPay() {
        return noOfDaysWork*payPerDay*0.7;
    }
}
class  PaymentProccessingSystem{

    public static void processPayment(Payable payable){
        ///logic to put the tax  cal and put the data base
        System.out.println("logic to put the tax  cal and put the data basel");
        System.out.println(payable.getPay());
        //
    }
}
public class DemoInheritance2 {

    public static void main(String[] args) {
        Integer i;
        // public FullTimeEmp(int id, String name, double salary, String ppfNo)
        FullTimeEmp fullTimeEmp=new FullTimeEmp(4, "ravi",4000, "AB3333");
        //fullTimeEmp.show();
        PaymentProccessingSystem.processPayment(fullTimeEmp);
    }
}
