package com.group.demo.controller;


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
    ResponseEntity<String> getEmployeeById(@PathVariable("id") String id) {
        return ResponseEntity.ok(id);
    }

    @GetMapping("/employees")
    ResponseEntity<Integer> getEmployees(@RequestParam("status") String status, @RequestParam("department") String department, @RequestParam("age") Integer age) {
        System.out.println(status);
        System.out.println(department);
        System.out.println(age);
        String response = employeeService.getEmployees(department);
        System.out.println(response);
        return ResponseEntity.ok(age);
    }

}
