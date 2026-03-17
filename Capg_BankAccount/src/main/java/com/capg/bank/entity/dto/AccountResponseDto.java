package com.capg.bank.entity.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountResponseDto {

    private Long balance;
    private Integer accountId;

    @Enumerated(EnumType.STRING)
    private AccountType accountType;

    private String holderEmail;
    private String accountHolderName;
}
