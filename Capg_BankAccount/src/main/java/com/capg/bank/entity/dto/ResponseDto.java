package com.capg.bank.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.ResponseEntity;

@Data
@AllArgsConstructor
public class ResponseDto {
    public ResponseDto(String statusCode, String statusMessage){
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
    }
    private String statusCode;
    private String statusMessage;
    private Object object;
}
