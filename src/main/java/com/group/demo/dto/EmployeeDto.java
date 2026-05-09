package com.group.demo.dto;

import com.group.demo.model.entity.Employee;

public class EmployeeDto {
    String name;
    String department;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // empty constructor
    public EmployeeDto() {}

    // parameterized constructor
    public EmployeeDto(String name, String department, int age) {
        this.name = name;
        this.department = department;
        this.age = age;
    }

    public EmployeeDto employeeDtoMapper(Employee employee) {
        this.setName(employee.getName());
        this.setDepartment(employee.getDepartment());
        this.setAge(employee.getAge());
        return this;
    }
}
