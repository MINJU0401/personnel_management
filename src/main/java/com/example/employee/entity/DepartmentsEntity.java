package com.example.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@Table(name="dapartments")
@Entity(name="departments")
public class DepartmentsEntity {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name = "department_number")
  private Integer departmentNumber;

  @NotBlank
  private String department;
}
