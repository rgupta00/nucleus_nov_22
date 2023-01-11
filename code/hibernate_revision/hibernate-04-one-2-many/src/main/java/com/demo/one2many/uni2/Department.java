package com.demo.one2many.uni2;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "dept_table_one2many")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer deptId;

	private String detpName;

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


	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", detpName=" + detpName +"]";
	}

	
}
