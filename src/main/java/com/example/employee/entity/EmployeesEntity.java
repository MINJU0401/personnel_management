package com.example.employee.entity;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.Valid;

import com.example.employee.dto.request.employee.PostEmployeeRequestDto;
import com.example.employee.entity.BenefitsEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="employees")
@Table(name="employees")
public class EmployeesEntity {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name = "employee_id")
  private Integer employeeId;

  private String name;
  
  @Column(name = "date_of_hire")
  private String dateOfHire;
  
  private Integer salary;
  
  @Column(name = "working_hours")
  private String workingHours;

  private String department;

  private String position;

  @OneToMany(mappedBy = "employeeId", cascade = CascadeType.ALL)
  private List<BenefitsEntity> benefits;

  private String status;

  public EmployeesEntity(PostEmployeeRequestDto dto) {

    Date hireDate = new Date();
    SimpleDateFormat simpleDateFormat = 
    new SimpleDateFormat("yyyy-MM-dd");
    String dateOfHire = simpleDateFormat.format(hireDate);

    Date workHours = new Date();
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm-HH:mm");
    String workingHours = timeFormat.format(workHours);

    this.employeeId = getEmployeeId();
    this.name = dto.getName();
    this.dateOfHire = dto.getDateOfHire();
    this.salary = dto.getSalary();
    this.workingHours = dto.getWorkingHours();
    this.department = dto.getDepartment();
    this.position = dto.getPosition();
    this.status = dto.getStatus();
        
  }

}
