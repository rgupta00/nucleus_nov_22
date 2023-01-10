package com.demo.value_mapping1;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@ToString
@EqualsAndHashCode
@Table(name = "cust_table_3")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	private String email;

	private String mobile;

	@Embedded
	@AttributeOverrides({
			@AttributeOverride(name = "addressLine", column = @Column(name = "office_addressLine")),
			@AttributeOverride(name = "city", column = @Column(name = "office_city")),
			@AttributeOverride(name = "country", column = @Column(name = "office_country")),
			@AttributeOverride(name = "pinCode", column = @Column(name = "office_pinCode"))
	})
	private Address officeAddress;


	@Embedded
	@AttributeOverrides({
			@AttributeOverride(name = "addressLine", column = @Column(name = "home_addressLine")),
			@AttributeOverride(name = "city", column = @Column(name = "home_city")),
			@AttributeOverride(name = "country", column = @Column(name = "home_country")),
			@AttributeOverride(name = "pinCode", column = @Column(name = "home_pinCode"))
	})
	private Address homeAddress;


	public Customer(String name, String email, String mobile) {
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}
}
