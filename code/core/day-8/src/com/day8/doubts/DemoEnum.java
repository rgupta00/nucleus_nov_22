package com.day8.doubts;

import java.util.Scanner;

enum Gender{
    M, F;

}
public class DemoEnum {
    public static void main(String[] args) {
        Gender[] genders= Gender.values();
        for (Gender g: genders){
            System.out.println(g+" : "+ g.ordinal()+" : "+ g.toString());
        }
//        boolean isOne=false;
//       do{
//           try{
//               Scanner scanner=new Scanner(System.in);
//               String gender= scanner.nextLine();
//               Gender g=Gender.valueOf(gender);
//               System.out.println(g);
//               isOne=true;
//           }catch (IllegalArgumentException e){
//               System.out.println("pls enter it agina");
//           }
//       }while (isOne!=true);
    }
}
