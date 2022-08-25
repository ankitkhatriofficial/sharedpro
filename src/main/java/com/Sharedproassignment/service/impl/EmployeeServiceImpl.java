package com.Sharedproassignment.service.impl;

import com.Sharedproassignment.entity.Employee;
import com.Sharedproassignment.repository.EmployeeRepo;
import com.Sharedproassignment.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

/**
 * @author Ankit Kumar
 */

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired private EmployeeRepo employeeRepo;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        Optional<Employee> optionalEmployee = employeeRepo.findById(id);
        return optionalEmployee.isPresent() ? optionalEmployee.get(): null;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        Assert.notNull(employee.getId(), "EmployeeId can't be null for update");
        return employeeRepo.save(employee);
    }

    @Override
    public void deleteEmployee(Integer id) {
        employeeRepo.deleteById(id);
    }

    @Override
    public List<Employee> getWithDeptId(Integer deptId) {
        return employeeRepo.findAllByDeptId(deptId);
    }
}
