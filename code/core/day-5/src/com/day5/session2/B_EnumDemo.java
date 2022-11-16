package com.day5.session2;
interface Washable{
    boolean isWashable();
}
enum ShirtSize implements  Washable{
    S(38),M(40),L(42),XL(44),XXL(46);
    private  int size;
    public int getSize(){
        return size;
    }
    public boolean isWashable(){
        return  false;
    }
    private ShirtSize(int size){
        System.out.println("ctr is called");
        this.size=size;
    }
}
class Shirt {
    private Integer id;
    private String color;
    private ShirtSize size;

    public Shirt(Integer id, String color, ShirtSize size) {
        this.id = id;
        this.color = color;
        this.size = size;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ShirtSize getSize() {
        return size;
    }

    public void setSize(ShirtSize size) {
        this.size = size;
    }
    public  void printShirt(){
        System.out.println("id: "+ id+" color "+ color+" size: "+ size);
    }
}
public class B_EnumDemo {

    public static void main(String[] args) {
        //how to convert a string to enum

        ShirtSize size2=ShirtSize.valueOf("S");
        System.out.println(size2);

        //enum to string
//        ShirtSize size=ShirtSize.L;
//        String sizeString= size.name();


//       ShirtSize[]shirtSizes= ShirtSize.values();
//       for (ShirtSize size: shirtSizes){
//           System.out.println(size.getSize()+" : "+size+" : "+ size.ordinal()+": "+ size.toString());
//       }

//        ShirtSize size=ShirtSize.L;
//        System.out.println(size);
//        System.out.println(size.getSize());

    Shirt shirt=new Shirt(3,"red",ShirtSize.S);
    shirt.printShirt();
    }
}
