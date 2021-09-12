package com.internship.planner.departments;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "departments",schema = "dbo")
public class Departments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DEPARTMENT_ID",columnDefinition = "int")
    private int departmentId;

    @Column(name = "NAME",columnDefinition = "nvarchar(50)")
    private String name;

    @Column(name = "COMPANY_ID",columnDefinition = "int")
    private int companyId;

    @Column(name = "MANAGER_ID",columnDefinition = "int")
    private int managerId;
}