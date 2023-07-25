package com.example.employee.dto.response.employee;

import com.example.employee.dto.response.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostEmployeeResponseDto extends ResponseDto {

  private Integer employeeId;

}
