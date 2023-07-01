package com.example.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="status")
@Entity(name="status")
public class StatusEntity {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name = "status_id")
  private Integer statusId;

  private String status;

}
