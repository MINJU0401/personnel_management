package com.example.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="employees")
@Table(name="employees")
public class EmployeeEntity {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name = "employee_id")
  private Integer employeeId;

  private String name;
  
  private String position;
  
  private String department;
  
  @Column(name = "date_of_hire")
  private String dateOfHire;
  
  private Integer salary;
  
  private String benefits;
  
  @Column(name = "working_hours")
  private String workingHours;
  
  private String status;
}
