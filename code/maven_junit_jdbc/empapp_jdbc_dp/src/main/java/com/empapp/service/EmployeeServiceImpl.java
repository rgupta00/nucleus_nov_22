package com.empapp.service;

import com.empapp.dao.Employee;
import com.empapp.dao.EmployeeDao;
import com.empapp.dao.EmployeeDaoImpl;

import java.util.List;
import java.util.Optional;

public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDao employeeDao;

    public EmployeeServiceImpl(){
        employeeDao=new EmployeeDaoImpl();
    }

    @Override
    public List<Employee> getAllWithProjets() {
        return employeeDao.getAllWithProjets();
    }

    @Override
    public List<Employee> getAll() {
        return employeeDao.getAll();
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeDao.addEmployee(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeDao.deleteEmployee(id);
    }

    @Override
    public void updateEmployee(int id, double salary) {
        employeeDao.updateEmployee(id, salary);
    }

    @Override
    public Optional<Employee> findById(int id) {
        return employeeDao.findById(id);
    }
}
