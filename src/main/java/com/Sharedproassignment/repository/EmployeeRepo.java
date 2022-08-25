package com.Sharedproassignment.repository;

import com.Sharedproassignment.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Ankit Kumar
 */

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

    List<Employee> findAllByDeptId(Integer deptId);
}
