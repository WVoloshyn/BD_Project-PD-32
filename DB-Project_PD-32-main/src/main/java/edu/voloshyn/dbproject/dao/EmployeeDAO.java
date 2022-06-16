package edu.voloshyn.dbproject.dao;

import edu.voloshyn.dbproject.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> getAllEmployees();

    public Employee getEmployee(int id);

    public void saveEmployee(Employee employee);

    public void deleteEmployee(int id);
}
