package com.internship.planner.strategic_plans;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "strategic_plans",schema = "dbo")
public class StrategicPlans {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "STRATEGIC_PLAN_ID",columnDefinition = "int")
    private int strategicPlanId;

    @Column(name = "START_MONTH",columnDefinition = "int")
    private int startMonth;

    @Column(name = "YEAR",columnDefinition = "int")
    private int year;

    @Column(name = "COMPANY_ID",columnDefinition = "int")
    private int companyId;

    @Column(name = "KPI_TARGET_RULE",columnDefinition = "int")
    private int kpiTargetRule;

    @Column(name = "ACTION_TARGET_RULE1",columnDefinition = "int")
    private int actionTargetRule1;

    @Column(name = "ACTION_TARGET_RULE2",columnDefinition = "int")
    private int actionTargetRule2;
}
