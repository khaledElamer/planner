package com.internship.planner.strategic_areas;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "strategic_areas",schema = "dbo")
public class StrategicAreas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "STRATEGIC_AREA_ID",columnDefinition = "int")
    private int strategicAreaaId;

    @Column(name = "NAME",columnDefinition = "nvarchar(50)")
    private String name;

    @Column(name = "COMPANY_ID",columnDefinition = "int")
    private int companyId;

}
