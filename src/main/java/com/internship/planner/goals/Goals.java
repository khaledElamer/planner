package com.internship.planner.goals;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "goals",schema = "dbo")
public class Goals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GOAL_ID",columnDefinition = "int")
    private int goalId;

    @Column(name = "NAME",columnDefinition = "nvarchar(50)")
    private String name;

    @Column(name = "STRATEGIC_PLAN_ID",columnDefinition = "int")
    private int strategicPlanId;

    @Column(name = "COMMENT",columnDefinition = "nvarchar(MAX)")
    private String comment;
}
