package com.internship.planner.departments;

import com.internship.planner.companies.Companies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentsController {
    @Autowired
    private DepartmentsRepository departmentsRepository;

    @GetMapping("departments-get-all")
    public List<Departments> getAllDepartments() {
        return departmentsRepository.findAll();
    }
}
