
 class  Emp{
    private  int id;
    private String name;

    private  double salary;

    public Emp(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
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

     public double getSalary() {
         return salary;
     }

     public void setSalary(double salary) {
         this.salary = salary;
     }

     public void setName(String name) {
         this.name = name;
     }
     public  void print(){
         System.out.println("id :"+ id + " name: "+ name+" salary : "+ salary);
     }
 }

    public class A_CtrEx {
        private static  final int i=77;
        public static void main(String[] args) {
            final  Emp e=new Emp(55,"raj",8000);
            //e=new Emp(44, "rajesh");
            e.print();
            e.setName("rajiv");
            e.print();
        }

        public static void processSalary(final  Emp e){
           // e=null;
        }
    }
