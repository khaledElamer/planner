package com.internship.planner.company_values;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyValuesRepository extends JpaRepository<CompanyValues, Integer> {
}
