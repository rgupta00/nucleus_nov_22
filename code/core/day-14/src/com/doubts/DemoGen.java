package com.doubts;
enum Gender{
    M, F;
}
public class DemoGen {
    public static void main(String[] args) {

        String genderString= "Moo";

        Gender gender=Gender.valueOf(genderString);
        System.out.println(gender);
    }
}
