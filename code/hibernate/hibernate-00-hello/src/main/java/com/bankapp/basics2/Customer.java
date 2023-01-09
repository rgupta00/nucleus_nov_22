package com.bankapp.basics2;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cust_table")
@ToString
@EqualsAndHashCode
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cust_id", nullable = false)
	private Integer id;
	@Column(name = "cust_name", nullable = false, length = 20)
	private String name;

	@Column(name = "cust_address", nullable = false, length = 20)
	private String address;

	@Column(name = "cust_mobile", nullable = false, length = 20)
	private String mobile;
	@Column(name = "cust_email", nullable = false, length = 20)
	private String email;
	@Enumerated(EnumType.STRING)
	private CustomerType customertype;
	@Temporal(TemporalType.DATE)
	private Date dob;

	public Customer(String name, String address, String mobile, String email, CustomerType customertype, Date dob) {
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
		this.customertype = customertype;
		this.dob = dob;
	}
}
