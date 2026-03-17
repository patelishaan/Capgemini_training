package com.capg.bank.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountDto {
    private Long balance;
    private AccountType accountType;
//    private Integer accountId;
    private String holderEmail;
    //private String accountSecureKey;
    private String accountHoldername;
    private String accountSecureKey;
}
