import java.util.Scanner;

abstract  class Shape{
    private String color;
    Shape(String color){
        this.color=color;
    }
    public  void printColor(){
        System.out.println("color is : "+ color);
    }
    public abstract   void printShape();
}
class Triangle extends  Shape{
    Triangle(String color){
        super(color);
    }
    public void printShape(){
        System.out.println("0.5 * b * h");
    }
}
class Square extends  Shape{
    Square(String color){
        super(color);
    }
    public void printShape(){
        System.out.println(" l * l");
    }
}

class Circle extends  Shape{
    Circle(String color){
        super(color);
    }
    public void printShape(){
        System.out.println("PI * r * r");
    }
}



public class ShapeExampleOverriding {
    public static void main(String[] args) {

//        Shape shape2=new Shape();
//        shape2.printShape();
       //run time poly: code flexibilty
        System.out.println("PE 1.Circle 2.Tri 3. Sq");
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        Shape shape=null;

        if(choice==1){
          shape=  new Circle("light blue");
        }else if(choice==2)
            shape=new Triangle("light blue");
        else if(choice==3)
            shape=new Square("light blue");

        if(shape!=null) {
            shape.printShape();
            shape.printColor();
        }
        else
            System.out.println("u have entered wrong choice");
    }
}
