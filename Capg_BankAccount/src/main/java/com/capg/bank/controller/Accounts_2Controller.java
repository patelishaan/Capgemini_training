package com.capg.bank.controller;

import com.capg.bank.entity.dto.Accounts_2RequestDto;
import com.capg.bank.entity.dto.Accounts_2ResponseDto;
import com.capg.bank.service.Accounts_2Service;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/accounts2")
public class Accounts_2Controller {
    private final Accounts_2Service accounts_2Service; //interface, not impl

    public Accounts_2Controller(Accounts_2Service accounts_2Service){
        this.accounts_2Service = accounts_2Service;
    }

    @PostMapping
    public ResponseEntity<Accounts_2ResponseDto> createAccount(
            @RequestBody Accounts_2RequestDto requestDto){
        Accounts_2ResponseDto response = accounts_2Service.createAccount(requestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    @GetMapping("/{accountNumber}")
    public ResponseEntity<Accounts_2ResponseDto> getAccount_2(
            @PathVariable String accountNumber
    ){
        Accounts_2ResponseDto response = accounts_2Service.getAccount(accountNumber);
        return ResponseEntity.ok(response);
    }

    @GetMapping("owner/{ownerName}")
    public ResponseEntity <List<Accounts_2ResponseDto>> getByOwner(@PathVariable String ownerName){
        return ResponseEntity.ok(accounts_2Service.getAccountByOwnerName(ownerName));
    }

    @GetMapping("findByStatus/{status}")
    public ResponseEntity<List<Accounts_2ResponseDto>> getByStatus(@PathVariable String status){
        return ResponseEntity.ok(accounts_2Service.getAccountByStatus(status));
    }
}
