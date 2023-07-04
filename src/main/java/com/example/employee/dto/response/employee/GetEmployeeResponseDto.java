package com.example.employee.dto.response.employee;

import java.util.ArrayList;
import java.util.List;

import com.example.employee.dto.response.ResponseDto;
import com.example.employee.entity.BenefitsEntity;
import com.example.employee.entity.EmployeesEntity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetEmployeeResponseDto extends ResponseDto {
  private Integer employeeId;
  private String name;
  private String position;
  private String department;
  private String dateOfHire;
  private Integer salary;
  private List<Benefits> benefits;
  private String workingHours;
  private String status;

  public GetEmployeeResponseDto(EmployeesEntity employeesEntity, List<BenefitsEntity> benefitEntities
  ) {
    super("SU", "Success");

    this.employeeId = employeesEntity.getEmployeeId();
    this.name = employeesEntity.getName();
    this.position = employeesEntity.getPosition();
    this.department = employeesEntity.getDepartment();
    this.dateOfHire = employeesEntity.getDateOfHire();
    this.salary = employeesEntity.getSalary();
    this.benefits = Benefits.benefitList(benefitEntities);
    this.workingHours = employeesEntity.getWorkingHours();
    this.status = employeesEntity.getStatus();
  }
}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class Benefits {
  private Integer employeeId;
  private String benefit;

  Benefits(BenefitsEntity benefitsEntity) {
    this.employeeId = benefitsEntity.getEmployeeId();
    this.benefit = benefitsEntity.getBenefit();
  }

  static List<Benefits> benefitList(List<BenefitsEntity> benefitEntities) {
    List<Benefits> benefitList = new ArrayList<>();
    for (BenefitsEntity benefitEntity: benefitEntities) {
      Benefits benefits = new Benefits(benefitEntity);
      benefitList.add(benefits);
    }
    return benefitList;
  }
}
