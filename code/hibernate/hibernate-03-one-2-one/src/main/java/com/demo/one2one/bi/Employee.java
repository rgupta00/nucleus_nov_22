package com.demo.one2one.bi;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "e_table_bi")
@Data
@NoArgsConstructor
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String empName;

	@OneToOne(mappedBy = "employee")
	private Parking parking;

	public Employee(String empName) {
		this.empName = empName;
	}
}
