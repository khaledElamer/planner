package com.internship.planner.kpi;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "kpi",schema = "dbo")
public class Kpi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "KPI_ID",columnDefinition = "int")
    private int kpiId;

    @Column(name = "OBJECTIVE_ID",columnDefinition = "int")
    private int objectiveId;

    @Column(name = "MONTH",columnDefinition = "int")
    private int month;

    @Column(name = "ACTUAL_VALUE",columnDefinition = "int")
    private int actualValue;

    @Column(name = "TARGET_VALUE",columnDefinition = "int")
    private int targetValue;
}
