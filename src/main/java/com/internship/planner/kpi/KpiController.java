package com.internship.planner.kpi;

import com.internship.planner.action_steps.Actions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KpiController {
    @Autowired
    private KpiRepository kpiRepository;

    @GetMapping("kpi-get-all")
    public List<Kpi> getAllKpi() {
        return kpiRepository.findAll();
    }
}
