package com.Sharedproassignment.controller;

import com.Sharedproassignment.entity.Professor;
import com.Sharedproassignment.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Ankit Kumar
 */
@RestController
@RequestMapping("/professors")
public class ProfessorController {

    @Autowired private ProfessorService professorService;

    @GetMapping("/get")
    public ResponseEntity<List<Professor>> getProfessors(){
        return new ResponseEntity<>(professorService.getAllProfessors(), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Professor> getProfessorById(@PathVariable Integer id){
        return new ResponseEntity<>(professorService.getProfessorById(id), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Professor> createProfessor(@RequestBody Professor professor){
        return new ResponseEntity<>(professorService.saveProfessor(professor), HttpStatus.CREATED);
    }

    @PatchMapping("/update")
    public ResponseEntity<Professor> updateProfessor(@RequestBody Professor professor){
        return new ResponseEntity<>(professorService.updateProfessor(professor), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteProfessor(@PathVariable Integer id){
        professorService.deleteProfessor(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/getWithDept/{id}")
    public ResponseEntity<List<Professor>> getWithFilters(@PathVariable Integer deptId){
        return new ResponseEntity<>(professorService.getWithDeptId(deptId), HttpStatus.OK);
    }

}
