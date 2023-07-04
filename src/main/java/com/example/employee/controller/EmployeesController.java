package com.example.employee.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.dto.response.employee.GetEmployeeListResponseDto;
import com.example.employee.dto.response.employee.GetEmployeeResponseDto;
import com.example.employee.dto.request.employee.PostEmployeeRequestDto;
import com.example.employee.dto.request.employee.PatchEmployeeInfoRequestDto;
import com.example.employee.dto.response.ResponseDto;
import com.example.employee.service.EmployeesService;

@RestController
@RequestMapping("api/v1/employees")
public class EmployeesController {
  
  @Autowired
  private EmployeesService employeesService;

  // 사원 등록
  @PostMapping("")
  public ResponseEntity<ResponseDto> postEmployee(
      @Valid @RequestBody PostEmployeeRequestDto requestBody
  ) {
      ResponseEntity<ResponseDto> response = employeesService.postEmployee(requestBody);
      return response;
  }

  // 특정 사원 정보 조회
  @GetMapping("{employeeId}")
  public ResponseEntity<? super GetEmployeeResponseDto> getEmployeeInfo(
    @PathVariable("employeeId") Integer employeeId
  ) {
    ResponseEntity<? super GetEmployeeResponseDto> response =
      employeesService.getEmployeeInfo(employeeId);
      return response;
  }

  // 전체 사원 목록 조회
  @GetMapping("list")
  public ResponseEntity<? super GetEmployeeListResponseDto> getEmployeeList() {
    ResponseEntity<? super GetEmployeeListResponseDto> response = 
      employeesService.getEmployeeList();
      return response;
  }

  // 특정 사원 정보 수정하기
  @PatchMapping("{employeeId}")
  public ResponseEntity<ResponseDto> patchEmployeeInfo(
    @Valid @RequestBody PatchEmployeeInfoRequestDto requestBody
    ) {
      ResponseEntity<ResponseDto> response = 
        employeesService.patchEmployeeInfo(requestBody);
        return response;
    }

  // 특정 사원 삭제하기
  @DeleteMapping("{employeeId}")
  public ResponseEntity<ResponseDto> deleteEmployee(
    @PathVariable("employeeId") Integer employeeId
  ) {
    ResponseEntity<ResponseDto> response =
      employeesService.deleteEmployee(employeeId);
      return response;
  }
}
