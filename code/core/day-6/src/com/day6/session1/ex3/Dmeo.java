package com.day6.session1.ex3;
record Emp(int id, String name){

}

public class Dmeo {
    public static void main(String[] args) {
    Emp e=new Emp(4,"raj");
        System.out.println(e.toString());
    }
}
