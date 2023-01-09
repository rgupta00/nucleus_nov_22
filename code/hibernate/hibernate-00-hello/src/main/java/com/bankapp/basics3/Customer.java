package com.bankapp.basics3;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "cust_table_2")
@ToString
@EqualsAndHashCode
public class Customer {

	//@Embedded
	@EmbeddedId
	private CustomerKey customerKey;

	@Column(name = "cust_address", nullable = false, length = 20)
	private String address;

	@Column(name = "cust_mobile", nullable = false, length = 20)
	private String mobile;

	@Enumerated(EnumType.STRING)
	private CustomerType customertype;
	@Temporal(TemporalType.DATE)
	private Date dob;

	public Customer(CustomerKey customerKey, String address, String mobile, CustomerType customertype, Date dob) {
		this.customerKey = customerKey;
		this.address = address;
		this.mobile = mobile;
		this.customertype = customertype;
		this.dob = dob;
	}
}
