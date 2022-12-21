package com.example.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.dto.Employee;
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

    @Query("Select e from Employee e where e.name like %:name%")
    Employee findEmployee(@Param("name")String name);
}
