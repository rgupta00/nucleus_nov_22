package com.day7.session2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Conversion{
    public static LocalDate dateStringToLocalDate(String  dateString){
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
       return  LocalDate.parse(dateString, dateTimeFormatter);
    }
}
class Validation{

    //([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]

    //M, F
    static boolean isValidGender(String genderType){
        if (genderType==null)
            return false;
        return genderType.matches("M|F");
    }


    static boolean isValidDate(String dateString){
        if (dateString==null)
            return false;
        return dateString.matches("([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]");
    }

    static boolean isValidEmailId(String emailId){
        if (emailId==null)
            return false;
        return emailId.matches("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+");
    }

    static boolean isValidPhoneNo(String phoneNo){
        if (phoneNo==null)
            return false;
        return phoneNo.matches("(0|91)?[789][0-9]{9}");
    }
}
public class A_RegEx {
    public static void main(String[] args){

        //how to manipuate the date
        System.out.println("PE a date");
      Scanner scanner=new Scanner(System.in);
      String dateString=scanner.nextLine();
     if( Validation.isValidDate(dateString)) {
         LocalDate localDate = Conversion.dateStringToLocalDate(dateString);
         System.out.println(localDate);
     }else
         System.out.println("converion is not possible");

        //System.out.println(localDate);

//        System.out.println("PE a phone no");
//       Scanner scanner=new Scanner(System.in);
//       String phoneNo=scanner.nextLine();
//
//        System.out.println(Validation.isValidPhoneNo(phoneNo));

//
//        System.out.println("PE a email");
//        Scanner scanner=new Scanner(System.in);
//        String emailId=scanner.nextLine();
//
//        System.out.println(Validation.isValidEmailId(emailId));


        //----1st way
//        Pattern pattern=Pattern.compile(".xx.");
//        Matcher matcher=pattern.matcher("AxxAB");
//        System.out.println(matcher.matches());


//        Matcher matcher=Pattern.compile(".xx.").matcher("AxxAB");
//        System.out.println(matcher.matches());

        //-------2nd way
//        boolean result =Pattern.matches(".AA.","xAAz");
//        System.out.println(result);
        //---------3 rd way

        //boolean result="xAAx".matches(".AA.");

//        System.out.println("PE a string");
//        Scanner scanner=new Scanner(System.in);
//        String data=scanner.nextLine();
//        System.out.println(data.matches(".xx."));
//
//        System.out.println( Pattern.matches("[xyz]","wbcd"));
//        System.out.println( Pattern.matches("[xyz]","x"));;//true anythong x or y or z
//
//        System.out.println( Pattern.matches("[xyz]{2,4}","xxxxx"));
//
//        System.out.println( Pattern.matches("[a-zA-Z]","A"));
//        System.out.println( Pattern.matches("[a-d[m-p]]","m" ));
//        System.out.println( Pattern.matches("[a-z&&[^bc]]","b" ));
//        System.out.println( Pattern.matches("[a-z&&[^bc]]","k" ));
        //System.out.println( Pattern.matches("x*","xxxxxxxx" ));
       // System.out.println( Pattern.matches("([a-z][0-9])+","a1b4" ));

       // System.out.println( Pattern.matches("\\D{5}","aaaaa" ));




    }
}
