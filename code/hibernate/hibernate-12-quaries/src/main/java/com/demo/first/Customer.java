package com.demo.first;

import lombok.*;

import javax.persistence.*;


//@NamedQueries({@NamedQuery( name = "findCustomer.byId",query = "from Customer c where c.id = :id" )})
//@NamedNativeQueries({
//		@NamedNativeQuery(
//				name = "findCustomer.byAddress",  query = "select * from Customer c where c.address = :address"  ,resultClass = Customer.class
//		)
//})
@Entity
@Table(name = "customer_table_sql")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;
	private String address;

	public Customer(String name, String address) {
		this.name = name;
		this.address = address;
	}
}
