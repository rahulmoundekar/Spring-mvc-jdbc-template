package com.spring.jdbc.app.dao;

import java.util.List;

import com.spring.jdbc.app.model.Employee;
public interface EmployeeDAO
{
    public void saveEmployee(Employee employee);
    public Employee getEmployeeById(int id);
    public void updateEmployee(Employee employee);
    public void deleteEmployee(int id);
    public List<Employee> getAllEmployees();
}
