package com.capg.bank.entity.dto;

import lombok.Data;

@Data
public class Accounts_2ResponseDto {
    private String accountNumber;
    private String ownerName;
    private Double balance;
    //that is all we need to send to the user
}

