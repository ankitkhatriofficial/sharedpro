package com.Sharedproassignment.service.impl;

import com.Sharedproassignment.entity.Department;
import com.Sharedproassignment.repository.DepartmentRepo;
import com.Sharedproassignment.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

/**
 * @author Ankit Kumar
 */

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired private DepartmentRepo departmentRepo;

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepo.findAll();
    }

    @Override
    public Department getDepartmentById(Integer id) {
        Optional<Department> optionalDepartment = departmentRepo.findById(id);
        return optionalDepartment.isPresent() ? optionalDepartment.get(): null;
    }

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepo.save(department);
    }

    @Override
    public Department updateDepartment(Department department) {
        Assert.notNull(department.getId(), "DepartmentId can't be null for update");
        return departmentRepo.save(department);
    }

    @Override
    public void deleteDepartment(Integer id) {
        departmentRepo.deleteById(id);
    }
}
