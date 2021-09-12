package com.internship.planner.employees;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "employees",schema = "dbo")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMPLOYEE_ID",columnDefinition = "int")
    private int employeeId;

    @Column(name = "NAME",columnDefinition = "nvarchar(50)")
    private String name;

    @Column(name = "DEPARTMENT_ID",columnDefinition = "int")
    private int departmentId;

    @Column(name = "TYPE",columnDefinition = "int")
    private int type;
}
