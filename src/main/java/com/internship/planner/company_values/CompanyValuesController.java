package com.internship.planner.company_values;

import com.internship.planner.generic.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CompanyValuesController {
    @Autowired
    private CompanyValuesRepository companyValuesRepository;

    @GetMapping("company_values-get-all")
    public List<CompanyValues> getAllValues() {
        return companyValuesRepository.findAll();
    }


    @GetMapping("company_values-get-by-id/{companyId}")
    public Optional<CompanyValues> GetValuesById(@PathVariable int companyId) {
        return companyValuesRepository.findById(companyId);

    }

    @PostMapping("company_values-save")
    public void SaveValueById(@RequestBody CompanyValues companyValues)
    {
        companyValuesRepository.save(companyValues);
    }

    @DeleteMapping("company_values-delete-by-id/{valueId}")
    public void DeleteValueById(@PathVariable int valueId)
    {
        companyValuesRepository.deleteById(valueId);
    }



}

