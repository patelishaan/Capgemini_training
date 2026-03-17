package com.capg.bank.entity;

import com.capg.bank.entity.dto.AccountType;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountId;
    private String accountSecureKey;
    private String accountHoldername;
    private String holderEmail;
    private Long balance;
    //private String accountType;
    @Enumerated(EnumType.STRING)
    private AccountType accountType;



}
