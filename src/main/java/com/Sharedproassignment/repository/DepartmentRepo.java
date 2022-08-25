package com.Sharedproassignment.repository;

import com.Sharedproassignment.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Ankit Kumar
 */

public interface DepartmentRepo extends JpaRepository<Department, Integer> {
}
