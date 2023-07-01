package com.example.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="benefits")
@Table(name="benefits")
public class BenefitsEntity {
  
  @Column(name="employee_id")
  private Integer employeeId;
  private String benefit;
}
