package com.capg.bank.controller;

import com.capg.bank.constants.AccountConstant;
import com.capg.bank.entity.dto.AccountDto;
import com.capg.bank.entity.dto.AccountResponseDto;
import com.capg.bank.entity.dto.ResponseDto;
import com.capg.bank.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;
    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createAccount(@RequestBody AccountDto accountDto){
        accountService.createAccount(accountDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDto(AccountConstant.STATUS_200, AccountConstant.MESSAGE_201));
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello boot!!";
    }
    @GetMapping("/byid/{id}")
    public ResponseEntity<ResponseDto> getAccountById(@PathVariable Integer id){
        AccountResponseDto accountDto = accountService.getAccountById(id);
        return ResponseEntity.status(HttpStatus.OK).body(new ResponseDto(AccountConstant.STATUS_200, AccountConstant.Message_get, accountDto));

    }
    @PostMapping("/tramsfer")
    public ResponseEntity<ResponseDto> transferAmount(@RequestParam Integer fromId,
                                                      @RequestParam Integer toId,
                                                      @RequestParam Long amount){
        accountService.transferMoney(fromId,toId,amount);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(new ResponseDto(
                        AccountConstant.STATUS_200,
                        "Account Transfer",
                        null
                ));
    }


}
