package com.example.employee.service.implement;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.employee.common.util.CustomResponse;
import com.example.employee.dto.request.employee.PatchEmployeeInfoRequestDto;
import com.example.employee.dto.request.employee.PostEmployeeRequestDto;
import com.example.employee.dto.response.ResponseDto;
import com.example.employee.dto.response.employee.GetEmployeeListResponseDto;
import com.example.employee.dto.response.employee.GetEmployeeResponseDto;
import com.example.employee.entity.BenefitsEntity;
import com.example.employee.entity.EmployeesEntity;
import com.example.employee.service.EmployeesService;
import com.example.employee.repository.BenefitsRepository;
import com.example.employee.repository.EmployeesRepository;

@Service
public class EmployeesServiceImplement implements EmployeesService{

  private EmployeesRepository employeesRepository;
  private BenefitsRepository benefitsRepository;

public EmployeesServiceImplement(EmployeesRepository employeesRepository, BenefitsRepository benefitsRepository) {
  this.employeesRepository = employeesRepository;
  this.benefitsRepository = benefitsRepository;
}

  @Override
  public ResponseEntity<ResponseDto> postEmployee(@Valid PostEmployeeRequestDto dto) {
    ResponseDto responseBody = null;

    List<String> benefits = dto.getBenefits();
    List<BenefitsEntity> benefitsList = new ArrayList<>();

    try {
        // 사원 등록
        EmployeesEntity employeesEntity = new EmployeesEntity(dto);
        employeesRepository.save(employeesEntity);

        Integer employeeId = employeesEntity.getEmployeeId(); // 새로 생성된 employeeId 가져오기

        for (String benefit : benefits) {
            BenefitsEntity benefitsEntity = new BenefitsEntity(employeeId, benefit);
            benefitsList.add(benefitsEntity);
        }      

        benefitsRepository.saveAll(benefitsList);

    } catch(Exception exception) {
        exception.printStackTrace();
        return CustomResponse.databaseError();
    }
        // 사원 등록 성공
        return CustomResponse.success();
  }

  @Override
  public ResponseEntity<? super GetEmployeeResponseDto> getEmployeeInfo(Integer employeeId) {

      return CustomResponse.success();

  }

  @Override
  public ResponseEntity<? super GetEmployeeListResponseDto> getEmployeeList() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getEmployeeList'");
  }

  @Override
  public ResponseEntity<ResponseDto> patchEmployeeInfo(@Valid PatchEmployeeInfoRequestDto requestBody) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'patchEmployeeInfo'");
  }

  @Override
  public ResponseEntity<ResponseDto> deleteEmployee(Integer employeeId) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deleteEmployee'");
  }
  
}
