package com.internship.planner.strategic_areas;

import com.internship.planner.action_steps.Actions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StrategicAreasController {
    @Autowired
    private StrategicAreasRepository strategicAreasRepository;

    @GetMapping("strategic_areas-get-all")
    public List<StrategicAreas> getAllStrategicAreas() {
        return strategicAreasRepository.findAll();
    }
}
