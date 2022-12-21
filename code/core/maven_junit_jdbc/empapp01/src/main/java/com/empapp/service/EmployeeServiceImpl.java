package com.empapp.service;

import com.empapp.dao.Employee;
import com.empapp.dao.EmployeeDao;
import com.empapp.dao.exceptions.EmployeeValiationException;
import com.empapp.dao.impl.EmployeeDaoImplJdbc;
import com.empapp.dao.impl.EmployeeDaoImplMap;
import com.empapp.dao.validation.EmployeeValidation;

import java.util.List;
//Amit :(
public class EmployeeServiceImpl implements EmployeeService{

    //Anil
    private EmployeeDao employeeDao;

    public EmployeeServiceImpl(){
        this.employeeDao=new EmployeeDaoImplMap();
    }

    @Override
    public List<Employee> getAll() {
        return employeeDao.getAll();
    }

    @Override
    public Employee getEmployeeById(int id) {
        return employeeDao.getEmployeeById(id);
    }

    @Override
    public void addEmployee(Employee employee) {
       if(!EmployeeValidation.isValidEmailId(employee.getEmail())){
          throw new EmployeeValiationException("email id is not  valid");
       }
        if(!EmployeeValidation.isValidPhoneNo(employee.getPhone())){
            throw new EmployeeValiationException("phone no d is not  valid");
        }

        employeeDao.addEmployee(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeDao.deleteEmployee(id);
    }

    @Override
    public void updateEmployee(int id, Employee employee) {
        employeeDao.updateEmployee(id, employee);
    }
}
