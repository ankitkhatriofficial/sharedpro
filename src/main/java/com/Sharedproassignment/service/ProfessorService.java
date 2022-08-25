package com.Sharedproassignment.service;

import com.Sharedproassignment.entity.Professor;

import java.util.List;

/**
 * @author Ankit Kumar
 */
public interface ProfessorService {

    List<Professor> getAllProfessors();

    Professor getProfessorById(Integer id);

    Professor saveProfessor(Professor professor);

    Professor updateProfessor(Professor professor);

    void deleteProfessor(Integer id);

    List<Professor> getWithDeptId(Integer deptId);
}
