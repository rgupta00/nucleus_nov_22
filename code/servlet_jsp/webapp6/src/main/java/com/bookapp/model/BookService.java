package com.bookapp.model;
import java.util.*;
public class BookService {
    public static List<String> getBooks(String topic){
        List<String> books=new ArrayList<>();
        if(topic.equals("java")){
         books.add("head first");
         books.add("head first dp");
        }else if(topic.equals("Servlet")){
            books.add("head first servlet jsp");
            books.add("notes");
        }else {
            books.add("spring in action");
            books.add("spring doc");
        }
      return  books;
    }
}
