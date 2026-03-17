package com.capg.bank.config;

import com.capg.bank.entity.Account;
import com.capg.bank.entity.dto.AccountDto;
import com.capg.bank.entity.dto.AccountResponseDto;

public class CustomMapper {
    public static AccountResponseDto mapAccountToResponseDto(Account account, AccountResponseDto accountResponseDto){
        accountResponseDto.setAccountType(account.getAccountType());
        accountResponseDto.setAccountId(account.getAccountId());
        accountResponseDto.setAccountHolderName(account.getAccountHoldername());
        accountResponseDto.setBalance(account.getBalance());

        return accountResponseDto;
    }
    public static Account mapAccountDtoToAccount(AccountDto accountDto, Account account){
        account.setAccountHoldername(accountDto.getAccountHoldername());
        account.setAccountType(accountDto.getAccountType());
        account.setAccountSecureKey(accountDto.getAccountSecureKey());
        account.setHolderEmail(accountDto.getHolderEmail());
        account.setBalance(accountDto.getBalance());
        return account;
    }
}
