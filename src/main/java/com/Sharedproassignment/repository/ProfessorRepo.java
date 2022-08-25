package com.Sharedproassignment.repository;

import com.Sharedproassignment.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Ankit Kumar
 */

public interface ProfessorRepo extends JpaRepository<Professor, Integer> {

    List<Professor> findAllByDeptId(Integer deptId);

}
