import javax.xml.validation.ValidatorHandler;

 interface   Vehical{
   abstract  void move(String source, String destination);
}


class  Car implements Vehical {
    public void move(String source, String destination){
        System.out.println("moving in a car from "+ source +" to "+ destination);
    }
}

class  Metro implements Vehical{
    public void move(String source, String destination){
        System.out.println("moving in a metro from "+ source +" to "+ destination);
    }
}

class  Bike implements Vehical{
    public void move(String source, String destination){
        System.out.println("moving on a bike from "+ source +" to "+ destination);
    }
}
class Passanger{
    private String name;
    Passanger(String name){
        this.name=name;
    }
    public  void travel(String source, String destination, Vehical vehical){
        System.out.println("passanger name: "+ name);
        vehical.move(source, destination);
    }
}

public class PassangerProblem {

    //ravi travelling from LN to Noida using car
    public static void main(String[] args) {
     //   Car car=new Car();
        Vehical vehical=new Car();
        Passanger passanger=new Passanger("ravi");
        passanger.travel("Laxmi nagar", "noida", vehical);
    }
}
