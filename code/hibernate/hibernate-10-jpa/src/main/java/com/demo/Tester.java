package com.demo;

import java.util.Date;
import java.util.List;

import javax.persistence.*;
public class Tester {

	public static void main(String[] args) {
	
		//JPA
		//SessionFactory === EntityManagerFactory				PU(persitance Unit)
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("ymsli_pu");
		
		EntityManager em=emf.createEntityManager();
		
		EntityTransaction tx= em.getTransaction();
		
		try {
			tx.begin();
			
			//how to get the data
			
			List<Book> resultList = 
					em.createQuery("select b from Book b", Book.class)
				.getResultList();
			
			resultList.forEach(b-> System.out.println(b));
			
			//Book book=em.getReference(Book.class, 33);
			//System.out.println("-----------");
			//System.out.println(book);
			
//			Book book=new Book("MAQ23", "rich dad poor dad", "abc", new Date(), 500);
//			book.setBookType(BookType.MGT);
//			
//			em.persist(book);
			tx.commit();
		}catch(Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		
		em.close();
		
		emf.close();
		
	}
}














