package com.Sharedproassignment.controller;

import com.Sharedproassignment.entity.Employee;
import com.Sharedproassignment.entity.Professor;
import com.Sharedproassignment.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Ankit Kumar
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired private EmployeeService employeeService;

    @GetMapping("/get")
    public ResponseEntity<List<Employee>> getEmpployees(){
        return new ResponseEntity<>(employeeService.getAllEmployees(), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id){
        return new ResponseEntity<>(employeeService.getEmployeeById(id), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        return new ResponseEntity<>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }

    @PatchMapping("/update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
        return new ResponseEntity<>(employeeService.updateEmployee(employee), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Integer id){
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/getWithDept/{id}")
    public ResponseEntity<List<Employee>> getWithFilters(@PathVariable Integer deptId){
        return new ResponseEntity<>(employeeService.getWithDeptId(deptId), HttpStatus.OK);
    }

}
