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
@AllArgsConstructor
@Entity(name ="benefits")
@Table(name = "benefits")
public class BenefitsEntity {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @Column(name = "employee_id")
  private Integer employeeId;

  @Column(name = "benefit")
  private String benefit;

  public BenefitsEntity(Integer employeeId, String benefit) {
    this.employeeId = employeeId;
    this.benefit = benefit;
  }
}
