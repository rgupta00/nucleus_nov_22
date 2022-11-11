class  Marker{
    private String color;
    private int price;
   public  Marker(String color, int price){
       this.color=color;
       this.price=price;
   }
   public  void print(){
       System.out.println("printing with "+ color+" marker");
   }
   public  void printMarkerDetals(){
       System.out.println("color: "+ color+" price: "+ price);
   }
}
class Trainer {
    private String name;
    private String subject;

    public Trainer(){}
    public Trainer(String name, String subject){
        this.name=name;
        this.subject=subject;
    }
    //Trainer use marker to teach
    public void teach(Marker marker){
        System.out.println("teching .....");
        marker.print();
    }
    public  void printTrainerDetails(){
        System.out.println("name: "+ name+" subject: "+ subject);
    }
}

public class UseAProblemTrainerMarker {

    public static void main(String[] args) {
    Marker marker=new Marker("red",50);
    Trainer trainer=new Trainer("raj","java");
        trainer.teach(marker);
    }
}
