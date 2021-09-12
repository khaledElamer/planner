package com.internship.planner.company_values;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "company_values", schema = "dbo")
public class CompanyValues {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VALUE_ID",columnDefinition = "int")
    private int valueId;

    @Column(name = "NAME",columnDefinition = "nvarchar(50)")
    private String name;

    @Column(name = "COMPANY_ID",columnDefinition = "int")
    private int companyId;
}
