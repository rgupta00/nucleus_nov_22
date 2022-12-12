package com.demo;
import  java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class ProcessingData {
    public static void main(String[] args) throws IOException {

        /*
        refer artical
        https://reflectoring.io/processing-files-using-java-8-streams/

        https://stackoverflow.com/questions/65111979/write-a-streamstring-to-a-file-java
         */
//        List<String> strList = Files
//                .readAllLines(Path.of("data.txt"));

        Stream<String> lines = Files.lines(Path.of("data.txt"));

        Consumer<String> stringConsumer=new Consumer<String>() {
            @Override
            public void accept(String line) {
                String []tokens= line.split(",");
                if(Boolean.parseBoolean(tokens[3])){
                    //file me proeses karan hey...
                }
            }
        };
        lines.forEach(stringConsumer);



//        Function<String, Employee> function=new Function<String, Employee>() {
//            @Override
//            public Employee apply(String line) {
//                String []tokens= line.split(",");
//                Employee employee=
//                        new Employee(Integer.parseInt(tokens[0]),
//                                tokens[1],
//                                Double.parseDouble(tokens[2]),
//                                Boolean.parseBoolean(tokens[3]));
//                return employee;
//            }
//        };
//        Consumer<Employee> employeeConsumer=new Consumer<Employee>() {
//            @Override
//            public void accept(Employee employee) {
//
//
//            }
//        };
//        lines.map(function).filter(e-> e.isPermanent()==true).forEach(e-> System.out.println(e));

    }
}
