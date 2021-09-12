package com.internship.planner.strategic_areas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StrategicAreasRepository extends JpaRepository<StrategicAreas, Integer> {
}
