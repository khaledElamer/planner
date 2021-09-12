package com.internship.planner.action_steps;

import com.internship.planner.error.NotFoundException;
import com.internship.planner.generic.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ActionsController {
    @Autowired
    private ActionsRepository actionsRepository;

    @GetMapping("actions-get-all")
    public Response<List<Actions>> getAllActions() {
        List<Actions> actionsList = actionsRepository.findAll();

        if (actionsList.isEmpty()) {
            throw new NotFoundException();
        }

        return new Response<>(actionsList, "Retrieved Successfully.", true);
    }
}
