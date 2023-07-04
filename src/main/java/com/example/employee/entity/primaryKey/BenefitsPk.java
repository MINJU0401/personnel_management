package com.example.employee.entity.primaryKey;

import java.io.Serializable;

import javax.persistence.Column;

import com.example.employee.entity.EmployeesEntity;

import lombok.Data;

@Data
public class BenefitsPk implements Serializable {

  @Column(name = "id")
  private Integer id;

  @Column(name = "employee_Id")
  private EmployeesEntity employeeId;

  @Column(name = "benefit")
  private String benefit;

}
