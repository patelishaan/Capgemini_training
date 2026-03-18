package com.bank.service.impl;

import com.bank.entity.Account;
import com.bank.entity.Transaction;
import com.bank.exception.InsufficientBalanceException;
import com.bank.exception.InvalidOperationException;
import com.bank.repository.AccountRepo;
import com.bank.repository.TransactionRepo;
import com.bank.service.AccountService;
import com.bank.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    private final AccountRepo accountRepo;
    private final TransactionRepo transactionRepo;
    private final AccountService accountService;

    @Override
    public Transaction deposit(Integer accountId, double amount) {
        Account account = accountService.getAccount(accountId);
        if (!account.isActive())
            throw new InvalidOperationException("Account is not active");

        account.setBalance(account.getBalance() + amount);
        accountRepo.save(account);

        return transactionRepo.save(Transaction.builder()
                .type("DEPOSIT")
                .amount(amount)
                .date(LocalDateTime.now())
                .account(account)
                .build());
    }

    @Override
    public Transaction withdraw(Integer accountId, double amount) {
        Account account = accountService.getAccount(accountId);
        if (!account.isActive())
            throw new InvalidOperationException("Account is not active");
        if (account.getBalance() < amount)
            throw new InsufficientBalanceException("Insufficient balance");

        account.setBalance(account.getBalance() - amount);
        accountRepo.save(account);

        return transactionRepo.save(Transaction.builder()
                .type("WITHDRAW")
                .amount(amount)
                .date(LocalDateTime.now())
                .account(account)
                .build());
    }

    @Override
    @Transactional
    public void transfer(Integer fromId, Integer toId, double amount) {
        Account from = accountService.getAccount(fromId);
        Account to = accountService.getAccount(toId);

        if (!from.isActive() || !to.isActive())
            throw new InvalidOperationException("One or both accounts are not active");
        if (from.getBalance() < amount)
            throw new InsufficientBalanceException("Insufficient balance for transfer");

        from.setBalance(from.getBalance() - amount);
        to.setBalance(to.getBalance() + amount);
        accountRepo.save(from);
        accountRepo.save(to);

        transactionRepo.save(Transaction.builder()
                .type("TRANSFER")
                .amount(amount)
                .date(LocalDateTime.now())
                .account(from)
                .build());
    }

    @Override
    public List<Transaction> getMiniStatement(Integer accountId) {
        accountService.getAccount(accountId);
        return transactionRepo.findByAccountId(accountId);
    }
}