package com.group.demo.controller;


import com.group.demo.dto.EmployeeDto;
import com.group.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees/{id}")
    public ResponseEntity<String> getEmployeeById(@PathVariable("id") String id) {
        return ResponseEntity.ok(id);
    }

    @GetMapping("/employees")
    public ResponseEntity<EmployeeDto> getEmployees(@RequestParam(required = false) String status, @RequestParam(required = false) String department, @RequestParam(defaultValue = "22") Integer age) {
        EmployeeDto employee = employeeService.getEmployees(department);
        return ResponseEntity.ok(employee);
    }

}
