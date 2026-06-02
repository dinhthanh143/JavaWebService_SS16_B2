package com.example.demo.b2.controller;

import com.example.demo.b2.model.Employee;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @GetMapping
    public List<Employee> getAllEmployees() {
        return List.of(new Employee(1L, "John Doe", "1000"), new Employee(2L, "Jane Doe", "2000"), new Employee(3L, "John Baka", "3000"));
    }
}
