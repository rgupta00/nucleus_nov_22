package com.day7.session1;
//Exception rethrowing and wrapping
class CalException extends Exception{
    public CalException(Exception e){
        super(e);
    }
}
class Cal{
    public int divide(int a, int b)throws CalException{
        int result=0;
        try{
            result= a/b;
        }catch (ArithmeticException e){
            throw  new CalException(e);
        }
        return result;
    }
}
public class C_ExWrappingAndRethrowing {
    public static void main(String[] args) {

        Cal cal=new Cal();
       try{
           cal.divide(4,0);
       }catch (CalException e){
           System.out.println(e);
       }
    }
}

