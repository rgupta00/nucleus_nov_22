package com.bankapp.basics3;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "cust_table_element_collection")
@ToString
@EqualsAndHashCode
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Integer id;

	private String name;

	private String mobile;

	@ElementCollection
	@CollectionTable(name = "cust_emails",joinColumns = @JoinColumn(name = "cid"))
	@Column(name = "cust_email")
	private List<String> emails=new ArrayList<>();


	public Customer(String name, String mobile) {
		this.name = name;
		this.mobile = mobile;
	}
	public void addEmail(String email){
		emails.add(email);
	}
}
