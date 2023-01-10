package com.demo.many2many;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.*;
@Entity
@Table(name = "emp_table_m2m")
public class Employee {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String empName;

	@JoinTable(name = "emp_proj_join_table",
	joinColumns=@JoinColumn(name = "empId_fk"),
	inverseJoinColumns = @JoinColumn(name = "projectId_fk"))
	@LazyCollection(LazyCollectionOption.EXTRA)
	@ManyToMany
	private List<Project> projects = new ArrayList<Project>();

	public Employee() {
	}

	public Employee(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}

}
