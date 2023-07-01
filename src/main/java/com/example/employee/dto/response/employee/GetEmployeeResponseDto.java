package com.example.employee.dto.response.employee;

import java.util.ArrayList;
import java.util.List;

import com.example.employee.entity.BenefitsEntity;
import com.example.employee.entity.EmployeeEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetEmployeeResponseDto {
  private Integer employeeId;
  private String name;
  private String position;
  private String department;
  private String dateOfHire;
  private Integer salary;
  private List<Benefits> benefits;
  private String workingHours;
  private String status;

  public GetEmployeeResponseDto(EmployeeEntity employeeEntity, List<BenefitsEntity> benefitEntities
  ) {
    super();

    this.employeeId = employeeEntity.getEmployeeId();
    this.name = employeeEntity.getName();
    this.position = employeeEntity.getPosition();
    this.department = employeeEntity.getDepartment();
    this.dateOfHire = employeeEntity.getDateOfHire();
    this.salary = employeeEntity.getSalary();
    this.benefits = Benefits.benefitList(benefitEntities);
    this.workingHours = employeeEntity.getWorkingHours();
    this.status = employeeEntity.getStatus();
  }
}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class Benefits {
  private Integer employeeId;
  private String benefit;

  Benefits(BenefitsEntity benefitEntity) {
    this.employeeId = benefitEntity.getEmployeeId();
    this.benefit = benefitEntity.getBenefit();
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
