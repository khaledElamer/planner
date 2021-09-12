package com.internship.planner.goals;

import com.internship.planner.action_steps.Actions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoalsController {
    @Autowired
    private GoalsRepository goalsRepository;

    @GetMapping("goals-get-all")
    public List<Goals> getAllGoals() {
        return goalsRepository.findAll();
    }
}
