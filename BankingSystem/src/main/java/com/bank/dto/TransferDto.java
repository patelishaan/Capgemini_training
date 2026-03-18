package com.bank.dto;

import jakarta.validation.constraints.Positive;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransferDto {

    private Integer fromAccountId;
    private Integer toAccountId;

    @Positive(message = "Transfer amount must be positive")
    private double amount;
}