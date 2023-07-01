package com.example.employee.common.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.employee.dto.response.ResponseDto;

public class CustomResponse {
      public static ResponseEntity<ResponseDto> vaildationFaild() {
        ResponseDto errorBody = new ResponseDto("VF", "Request Parameter Validation Failed");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorBody);
    }
}
