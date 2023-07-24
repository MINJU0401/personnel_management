package com.example.employee.common.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.employee.dto.response.ResponseDto;

public class CustomResponse {

    public static ResponseEntity<ResponseDto> vaildationFailed() {
      ResponseDto errorBody = new ResponseDto("VF", "Request Parameter Validation Failed");
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorBody);
    }

    public static ResponseEntity<ResponseDto> success() {
      ResponseDto body = new ResponseDto("SU", "SUCCESS");
      return ResponseEntity.status(HttpStatus.OK).body(body);
    }
    
    public static ResponseEntity<ResponseDto> databaseError() {
      ResponseDto errorBody = new ResponseDto("DE", "Database Error");
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorBody);
    }

    public static ResponseEntity<ResponseDto> nonExistsEmployeeIdError() {
      ResponseDto errorBody = new ResponseDto("EE", "Non-Existent Employee ID");
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorBody);
    }
    


}
