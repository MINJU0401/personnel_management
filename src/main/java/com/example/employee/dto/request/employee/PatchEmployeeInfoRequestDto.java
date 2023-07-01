package com.example.employee.dto.request.employee;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class PatchEmployeeInfoRequestDto {
  @NotNull
  private Integer employeeId;
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
  private List<String> benefits;
  @NotBlank
  private String workingHours;
  @NotBlank
  private String status;
}
