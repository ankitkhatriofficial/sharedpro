package com.Sharedproassignment.service.impl;

import com.Sharedproassignment.entity.Professor;
import com.Sharedproassignment.repository.ProfessorRepo;
import com.Sharedproassignment.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

/**
 * @author Ankit Kumar
 */

@Service
public class ProfessorServiceImpl implements ProfessorService {

    @Autowired private ProfessorRepo professorRepo;

    @Override
    public List<Professor> getAllProfessors() {
        return professorRepo.findAll();
    }

    @Override
    public Professor getProfessorById(Integer id) {
        Optional<Professor> optionalProfessor = professorRepo.findById(id);
        return optionalProfessor.isPresent() ? optionalProfessor.get(): null;
    }

    @Override
    public Professor saveProfessor(Professor employee) {
        return professorRepo.save(employee);
    }

    @Override
    public Professor updateProfessor(Professor employee) {
        Assert.notNull(employee.getId(), "ProfessorId can't be null for update");
        return professorRepo.save(employee);
    }

    @Override
    public void deleteProfessor(Integer id) {
        professorRepo.deleteById(id);
    }

    @Override
    public List<Professor> getWithDeptId(Integer deptId) {
        return professorRepo.findAllByDeptId(deptId);
    }
}
