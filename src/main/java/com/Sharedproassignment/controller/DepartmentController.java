package com.Sharedproassignment.controller;

import com.Sharedproassignment.entity.Department;
import com.Sharedproassignment.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Ankit Kumar
 */
@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired private DepartmentService departmentService;

    @GetMapping("/get")
    public ResponseEntity<List<Department>> getDepartments(){
        return new ResponseEntity<>(departmentService.getAllDepartments(), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable Integer id){
        return new ResponseEntity<>(departmentService.getDepartmentById(id), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Department> createDepartment(@RequestBody Department department){
        return new ResponseEntity<>(departmentService.saveDepartment(department), HttpStatus.CREATED);
    }

    @PatchMapping("/update")
    public ResponseEntity<Department> updateDepartment(@RequestBody Department department){
        return new ResponseEntity<>(departmentService.updateDepartment(department), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteDepartment(@PathVariable Integer id){
        departmentService.deleteDepartment(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
