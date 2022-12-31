package com.core.topic1.lsp.right;
//Square Rect problem
//Favour composion over inheritance :LSP
class Rectangle{
    private int l, b;

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public int getArea(){
        return l*b;
    }
}
class Square{
  private int l;
  private Rectangle rectangle;
    public Square(int l){
        rectangle=new Rectangle(l, l);
    }
    public int getArea(){
        return  rectangle.getArea();
    }
    public void changeDimension(int changedDimesion){
        l=changedDimesion;
        rectangle.setB(changedDimesion);
        rectangle.setL(changedDimesion);
    }

}

public class SqRectangleProblem {
    public static void main(String[] args) {

        Square square=new Square(4);
        System.out.println(square.getArea());

        square.changeDimension(6);
        System.out.println(square.getArea());
    }
}







