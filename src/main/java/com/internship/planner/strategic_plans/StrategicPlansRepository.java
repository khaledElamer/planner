package com.internship.planner.strategic_plans;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StrategicPlansRepository extends JpaRepository<StrategicPlans, Integer> {
}
