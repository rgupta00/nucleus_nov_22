package com.core.topic1.lsp.wrong;
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
class Square extends Rectangle{
  private int l;

    public Square(int l) {
        super(l, l);
    }
    public int getArea(){
       return  super.getArea();
    }
}

public class SqRectangleProblem {
    public static void main(String[] args) {

        Square square=new Square(4);
        System.out.println(square.getArea());
        square.setB(7);
        System.out.println(square.getArea());
    }
}







