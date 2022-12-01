package com.doubts;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DemoLocalDate {
    public static void main(String[] args) {

        //how to play with java 8 date:

        //a. u need current date
        LocalDate localDate1=LocalDate.now();

        //b. some other date
        LocalDate localDate2=LocalDate.of(2011, Month.NOVEMBER, 11);

        //c. converting string to date

        String dateString="11/10/2011";
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate localDate=LocalDate.parse(dateString, dateTimeFormatter);

        System.out.println(localDate);
    }
}
