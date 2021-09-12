package com.internship.planner.action_steps;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "action_steps", schema = "dbo")
public class Actions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ACTION_STEP_ID",columnDefinition = "int")
    private int actionStepId;

    @Column(name = "NAME",columnDefinition = "nvarchar(50)")
    private String name;

    @Column(name = "OBJECTIVE_ID",columnDefinition = "int")
    private int objectiveId;

    @Column(name = "MANAGER_ID",columnDefinition = "int")
    private int managerId;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "BEGIN_DATE",columnDefinition = "date")
    private Date beginDate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "DUE_DATE",columnDefinition = "date")
    private Date dueDate;

    @Column(name = "PROGRESS",columnDefinition = "int")
    private int progress;

    @Column(name = "STATUS",columnDefinition = "nvarchar(50)")
    private String status;
}
