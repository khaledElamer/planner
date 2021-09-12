package com.internship.planner.strategic_plans;

import com.internship.planner.action_steps.Actions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StrategicPlansController {
    @Autowired
    private StrategicPlansRepository strategicPlansRepository;

    @GetMapping("strategic_plans-get-all")
    public List<StrategicPlans> getAllStrategicPlans() {
        return strategicPlansRepository.findAll();
    }
}
