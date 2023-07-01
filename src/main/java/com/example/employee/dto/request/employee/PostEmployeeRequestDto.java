package com.example.employee.dto.request.employee;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PostEmployeeRequestDto {
  @NotBlank
  private String name;
  @NotBlank
  private String position;
  @NotBlank
  private String department;
  @NotBlank
  private String dateOfHire;
  @NotNull
  private Integer salary;
  private String benefits;
  @NotBlank
  private String workingHours;
  @NotBlank
  private String status;
}