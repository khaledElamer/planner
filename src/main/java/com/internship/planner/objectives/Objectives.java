package com.internship.planner.objectives;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "objectives",schema = "dbo")
public class Objectives {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OBJECTIVE_ID",columnDefinition = "int")
    private int objectiveId;

    @Column(name = "NAME",columnDefinition = "nvarchar(50)")
    private String name;

    @Column(name = "GOAL_ID",columnDefinition = "int")
    private int goalId;

    @Column(name = "STRATEGIC_AREA_ID",columnDefinition = "int")
    private int strategicAreaId;

    @Column(name = "FORMAT",columnDefinition = "int")
    private int format;

    @Column(name = "BEST_DIR",columnDefinition = "nvarchar(50)")
    private String bestDir;

    @Column(name = "EXPRESSION",columnDefinition = "nvarchar(50)")
    private String expression;

    @Column(name = "COMMENT",columnDefinition = "nvarchar(MAX)")
    private String comment;
}
