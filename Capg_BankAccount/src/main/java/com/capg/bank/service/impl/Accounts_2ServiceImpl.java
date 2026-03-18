package com.capg.bank.service.impl;

import com.capg.bank.config.CustomMapper;
import com.capg.bank.constants.Accounts_2Constant;
import com.capg.bank.entity.Accounts_2;
import com.capg.bank.entity.dto.Accounts_2RequestDto;
import com.capg.bank.entity.dto.Accounts_2ResponseDto;
import com.capg.bank.repository.Accounts_2Repository;
import com.capg.bank.service.Accounts_2Service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class Accounts_2ServiceImpl implements Accounts_2Service {
    private final Accounts_2Repository accounts2Repository;
    private final CustomMapper mapper;
//    public Accounts_2ServiceImpl(Accounts_2Repository accounts2Repository, CustomMapper mapper){
//        this.accounts2Repository = accounts2Repository;
//        this.mapper = mapper;
//    }

    @Override
    public Accounts_2ResponseDto createAccount(Accounts_2RequestDto dto){
        //DTO->ENTITY
        Accounts_2 account2 = mapper.toEntity(dto);
        //BUSINESS LOGIC - GENERATE ACCOUNT NUMBER
        String accNumber = Accounts_2Constant.ACCOUNTS_2PREFIX + System.currentTimeMillis();
        account2.setAccountNumber(accNumber);
        //BUSINESS LOGIC - SET DEFAULT STATUS
        account2.setStatus(Accounts_2Constant.ACCOUNTS_2ACTIVE);
        //BUSINESS LOGIC - MINIMUM DEPOSIT CHECK
        if(dto.getInitialDeposit()<500){
            throw new RuntimeException("Minimum deposit is 500 INR");
        }
        //SAVE TO DATABASE
        Accounts_2 savedAccount2 =accounts2Repository.save(account2);
        return mapper.toDto(savedAccount2);
    }

    @Override
    public Accounts_2ResponseDto getAccount(String accountNumber){
        Accounts_2 accounts2 = accounts2Repository
                .findByAccountNumber(accountNumber)
                .orElseThrow(()-> new RuntimeException("Account not found"));
        return mapper.toDto(accounts2);
    }

    @Override
    public Accounts_2ResponseDto deposit(String accountNumber, Double amount) {
        return null;
    }
    @Override
    public List<Accounts_2ResponseDto> getAccountByOwnerName(String ownerName){
        List<Accounts_2> accounts2 = accounts2Repository.findByOwnerName(ownerName);
        return accounts2.stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<Accounts_2ResponseDto> getAccountByStatus(String status){
        List<Accounts_2> acc2 = accounts2Repository.findByStatus(status);
        return  acc2.stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }


}
