package com.internship.planner.objectives;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjectivesRepository extends JpaRepository<Objectives, Integer> {
}
