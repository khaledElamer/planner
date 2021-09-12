package com.internship.planner.companies;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "companies",schema = "dbo")
public class Companies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COMPANY_ID",columnDefinition = "int")
    private int companyId;

    @Column(name = "NAME",columnDefinition = "nvarchar(50)")
    private String name;

    @Column(name = "SLOGAN",columnDefinition = "nvarchar(50)")
    private String slogan;

    @Column(name = "VISION",columnDefinition = "nvarchar(MAX)")
    private String vision;

    @Column(name = "MISSION",columnDefinition = "nvarchar(MAX)")
    private String mission;
}
