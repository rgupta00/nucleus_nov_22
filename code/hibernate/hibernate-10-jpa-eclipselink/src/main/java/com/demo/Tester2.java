package com.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;

public class Tester2 {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("foo");

//        EntityManager em=emf.createEntityManager();
//
//        //String isbn, String title, String author, Date pubDate, double price
//
//        EntityTransaction tx=em.getTransaction();
//        try{
//            tx.begin();
//
//            //Book book1=em.getReference(Book.class, 1);//getReference vs load
//
////            Book book1=em.find(Book.class, 1);//find vs get
////            System.out.println("--------------");
////            System.out.println(book1);
//            //em.persist(book);
//
//            Book book=new Book("333","effective java","JB",new Date(),500.00 );
//            book.setBookType(BookType.CS);
//            em.persist(book);
//            tx.commit();
//        }catch (Exception e){
//            tx.rollback();
//        }
//        em.close();

        emf.close();

    }
}
