package com.internship.planner.employees;

import com.internship.planner.action_steps.Actions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeesController {
    @Autowired
    private EmployeesRepository employeesRepository;

    @GetMapping("employees-get-all")
    public List<Employees> getAllEmployees() {
        return employeesRepository.findAll();
    }
}
