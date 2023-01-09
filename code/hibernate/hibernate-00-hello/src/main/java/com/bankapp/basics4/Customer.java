package com.bankapp.basics4;

import com.bankapp.basics3.CustomerKey;
import com.bankapp.basics3.CustomerType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "cust_table_3", uniqueConstraints = @UniqueConstraint(columnNames = {"name","email"}))
@ToString
@EqualsAndHashCode
//https://stackoverflow.com/questions/42689594/unique-constraint-with-composite-keys-in-jpa

public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "cust_name", nullable = false)
	private String name;

	@Column(name = "cust_email", nullable = false)
	private String email;

	@Column(name = "cust_address", nullable = false, length = 20)
	private String address;

	@Column(name = "cust_mobile", nullable = false, length = 20)
	private String mobile;

	@Enumerated(EnumType.STRING)
	private CustomerType customertype;
	@Temporal(TemporalType.DATE)
	private Date dob;


}
