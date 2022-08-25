package com.Sharedproassignment.service;


import com.Sharedproassignment.entity.Department;

import java.util.List;

/**
 * @author Ankit Kumar
 */
public interface DepartmentService {

    List<Department> getAllDepartments();

    Department getDepartmentById(Integer id);

    Department saveDepartment(Department department);

    Department updateDepartment(Department department);

    void deleteDepartment(Integer id);
}
