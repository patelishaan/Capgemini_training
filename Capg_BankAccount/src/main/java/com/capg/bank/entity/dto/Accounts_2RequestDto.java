package com.capg.bank.entity.dto;

import lombok.Data;

@Data
public class Accounts_2RequestDto {
    private String ownerName;
    private Double initialDeposit;
    //that is all the user needs to send
}

