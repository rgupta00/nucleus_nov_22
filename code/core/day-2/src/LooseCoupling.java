//A passanger named raj moving from LN to Noida using metro
class  Vehical{
    public  void move(String source, String destination){
        System.out.println("moving from "+ source+" to "+destination+" using ?");
    }
}

class  Metro extends Vehical{
    public  void move(String source, String destination){
        System.out.println("moving from "+ source+" to "+destination+" using metro");
    }
}
class  Car extends  Vehical{
    public  void move(String source, String destination){
        System.out.println("moving from "+ source+" to "+destination+" using car");
    }
}
class  Passanger{
    private  String name;
    Passanger(String name){
        this.name=name;
    }
    public  void travel(String source, String destination, Vehical  vehical){
        System.out.println("name of passanger : "+ name);
        vehical.move(source,destination);
    }
}

public class LooseCoupling {

    public static void main(String[] args) {

      //  Metro metro=new Metro();
        Vehical vehical=new Metro();
        Passanger passanger=new Passanger("ravi");
        passanger.travel("LN","Noida 62", vehical);
    }
}
