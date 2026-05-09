package com.group.demo.service;

import com.group.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public String getEmployees(String id) {
        employeeRepository.getEmployees(id);
        return "Madhusudhan";
    }
}
