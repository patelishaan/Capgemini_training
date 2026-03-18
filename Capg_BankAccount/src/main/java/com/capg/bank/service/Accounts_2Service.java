package com.capg.bank.service;

import com.capg.bank.entity.dto.Accounts_2RequestDto;
import com.capg.bank.entity.dto.Accounts_2ResponseDto;

import java.util.List;

public interface Accounts_2Service {
    Accounts_2ResponseDto createAccount(Accounts_2RequestDto dto);
    Accounts_2ResponseDto getAccount(String accountNumber);
    Accounts_2ResponseDto deposit(String accountNumber, Double amount);
    List<Accounts_2ResponseDto> getAccountByOwnerName(String ownerName);
    List<Accounts_2ResponseDto> getAccountByStatus(String status);
}
