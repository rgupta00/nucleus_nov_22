package com.demo.one2many;

import org.hibernate.annotations.BatchSize;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "dept_table_one2many")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer deptId;

	private String detpName;

	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@BatchSize(size=2)
	private List<Employee> employees = new ArrayList<Employee>();

	public Department(String detpName) {
		this.detpName = detpName;
	}

	public Department() {
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDetpName() {
		return detpName;
	}

	public void setDetpName(String detpName) {
		this.detpName = detpName;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", detpName=" + detpName +"]";
	}

	
}
