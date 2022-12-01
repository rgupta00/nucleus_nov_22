package com.demo;

import java.util.Scanner;

class Shape{
    void display(){
        System.out.println("it is a shape");
    }
}
class Circle extends  Shape{
    void display(){
        System.out.println("it is a circle");
    }
}
class Square extends  Shape{
    void display(){
        System.out.println("it is a square");
    }
}
class Triangle extends  Shape{
    void display(){
        System.out.println("it is a Triangle");
    }
}

public class FunctionOverriding {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("PE choice of ur shape 1.cirlce 2. Tri  3. Sq");
        int choice=scanner.nextInt();
        Shape shape=null;
        if(choice==1){
            shape=new Circle();
        }else if(choice==2){
            shape=new Triangle();
        }else  if(choice==3){
            shape=new Shape();
        }
        if(shape!=null)
        shape.display();
    }
}
