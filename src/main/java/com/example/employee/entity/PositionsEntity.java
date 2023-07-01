package com.example.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@Entity(name="positions")
@Table(name="positions")
public class PositionsEntity {
  
  @Id
  @Column(name="position_number")
  private Integer positionNumber;

  @NotBlank
  private String position;
}
