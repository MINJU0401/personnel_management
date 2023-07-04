package com.example.employee.service;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;

import com.example.employee.dto.response.employee.GetEmployeeListResponseDto;
import com.example.employee.dto.response.employee.GetEmployeeResponseDto;
import com.example.employee.dto.response.ResponseDto;
import com.example.employee.dto.request.employee.PatchEmployeeInfoRequestDto;
import com.example.employee.dto.request.employee.PostEmployeeRequestDto;

public interface EmployeesService {

  ResponseEntity<ResponseDto> postEmployee(PostEmployeeRequestDto dto);

  ResponseEntity<? super GetEmployeeResponseDto> getEmployeeInfo(Integer employeeId);

  ResponseEntity<? super GetEmployeeListResponseDto> getEmployeeList();

  ResponseEntity<ResponseDto> patchEmployeeInfo(@Valid PatchEmployeeInfoRequestDto requestBody);

  ResponseEntity<ResponseDto> deleteEmployee(Integer employeeId);
  
}
