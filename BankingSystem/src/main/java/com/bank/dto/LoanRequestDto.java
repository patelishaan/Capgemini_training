package com.bank.dto;

import jakarta.validation.constraints.Positive;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoanRequestDto {

    private Integer accountId;

    @Positive(message = "Loan amount must be positive")
    private double amount;
}