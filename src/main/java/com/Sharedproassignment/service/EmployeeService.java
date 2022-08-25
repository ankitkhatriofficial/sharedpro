package com.Sharedproassignment.service;

import com.Sharedproassignment.entity.Employee;

import java.util.List;

/**
 * @author Ankit Kumar
 */
public interface EmployeeService {

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Integer id);

    Employee saveEmployee(Employee employee);

    Employee updateEmployee(Employee employee);

    void deleteEmployee(Integer id);

    List<Employee> getWithDeptId(Integer deptId);
}
