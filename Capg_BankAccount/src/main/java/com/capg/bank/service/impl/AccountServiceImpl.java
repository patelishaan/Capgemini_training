package com.capg.bank.service.impl;


import com.capg.bank.config.CustomMapper;
import com.capg.bank.entity.Account;
import com.capg.bank.entity.dto.AccountDto;
import com.capg.bank.entity.dto.AccountResponseDto;
import com.capg.bank.repository.AccountRepository;
import com.capg.bank.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;
    private final ModelMapper modelMapper;

    // private final NodeMapper nodeMapper;
    @Override
    public void createAccount(AccountDto accountDto){
        Account account = new Account();
        account.setAccountHoldername(accountDto.getAccountHoldername());
        account.setAccountType(accountDto.getAccountType());
        account.setAccountSecureKey(accountDto.getAccountSecureKey());
        account.setHolderEmail(accountDto.getHolderEmail());
        account.setBalance(accountDto.getBalance());
        accountRepository.save(account);
    }
    @Override
    public AccountResponseDto getAccountById(Integer id){
        Account account = accountRepository.findById(id)
                .orElseThrow(()->new RuntimeException("account not found"));
        return modelMapper.map(account, AccountResponseDto.class);
    }
}
