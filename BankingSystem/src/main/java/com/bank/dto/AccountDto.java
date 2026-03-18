package com.bank.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {

    @NotBlank(message = "Account type is required")
    private String type;

    @Positive(message = "Initial balance must be positive")
    private double balance;
}