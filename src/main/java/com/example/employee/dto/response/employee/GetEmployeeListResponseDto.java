package com.example.employee.dto.response.employee;

import java.util.ArrayList;
import java.util.List;

import com.example.employee.dto.response.ResponseDto;
import com.example.employee.entity.resultSet.EmployeeListResultSet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
public class GetEmployeeListResponseDto extends ResponseDto {
  private List<Employees> employeeList;

  public GetEmployeeListResponseDto(List<EmployeeListResultSet> resultSet) {
    super("SU", "Success");

    List<Employees> employeeList = new ArrayList<>();

    for (EmployeeListResultSet result: resultSet) {
      Employees employees = new Employees(result);
      employeeList.add(employees);
    }

    this.employeeList = employeeList;
  }
}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class Employees {
  private Integer employeeId;
  private String name;
  private String position;
  private String department;
  private String dateOfHire;
  private Integer salary;
  private String benefits;
  private String workingHours;
  private String status;

  public Employees(EmployeeListResultSet resultSet) {
    this.employeeId = resultSet.getEmployeeId();
    this.name = resultSet.getName();
    this.position = resultSet.getPosition();
    this.department = resultSet.getDepartment();
    this.dateOfHire = resultSet.getDateOfHire();
    this.salary = resultSet.getSalary();
    this.benefits = resultSet.getBenefits();
    this.workingHours = resultSet.getWorkingHours();
    this.status = resultSet.getStatus();

  }
}
