package com.capg.bank.config;

import com.capg.bank.entity.Account;
import com.capg.bank.entity.Accounts_2;
import com.capg.bank.entity.dto.AccountDto;
import com.capg.bank.entity.dto.AccountResponseDto;
import com.capg.bank.entity.dto.Accounts_2RequestDto;
import com.capg.bank.entity.dto.Accounts_2ResponseDto;
import org.springframework.stereotype.Component;

@Component
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

    public Accounts_2 toEntity(Accounts_2RequestDto dto){
        Accounts_2 acc = new Accounts_2();
        acc.setOwnerName(dto.getOwnerName());
        acc.setOwnerName(dto.getOwnerName());
        acc.setBalance(dto.getInitialDeposit());
        return acc;
    }
    public Accounts_2ResponseDto toDto(Accounts_2 acc){
        Accounts_2ResponseDto dto = new Accounts_2ResponseDto();
        dto.setAccountNumber(acc.getAccountNumber());
        dto.setOwnerName(acc.getOwnerName());
        dto.setBalance(acc.getBalance());
        return dto;
    }
}
