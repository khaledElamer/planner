package com.internship.planner.companies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompaniesController {
    @Autowired
    private CompaniesRepository companiesRepository;

    @GetMapping("companies-get-all")
    public List<Companies> getAllCompanies() {
        return companiesRepository.findAll();
    }
}