package com.group.demo.repository;


import com.group.demo.model.entity.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
    public Employee getEmployees() {
        Employee employee = new Employee("Madhusudhan", "IT", 32);
        return employee;
    }
}
