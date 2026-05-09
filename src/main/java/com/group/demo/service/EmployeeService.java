package com.group.demo.service;

import com.group.demo.dto.EmployeeDto;
import com.group.demo.model.entity.Employee;
import com.group.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public EmployeeDto getEmployees(String id) {
        Employee employee = employeeRepository.getEmployees();
        EmployeeDto employeeDto = new EmployeeDto(employee.getName(), employee.getDepartment(), employee.getAge());
//        return employeeDto.employeeDtoMapper(employee);
        return employeeDto;
    }
}
