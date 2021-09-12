package com.internship.planner.objectives;

import com.internship.planner.action_steps.Actions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ObjectivesController {
    @Autowired
    private ObjectivesRepository objectivesRepository;

    @GetMapping("objectives-get-all")
    public List<Objectives> getAllObjectives() {
        return objectivesRepository.findAll();
    }
}
