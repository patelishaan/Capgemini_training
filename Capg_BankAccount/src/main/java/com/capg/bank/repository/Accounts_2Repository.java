package com.capg.bank.repository;

import com.capg.bank.entity.Accounts_2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface Accounts_2Repository extends JpaRepository<Accounts_2, Long> {
    //spring generates basic CRUD operations by itself but we can add custom queries
    Optional<Accounts_2> findByAccountNumber(String accountNumber);
    List<Accounts_2> findByOwnerName(String ownerName);
    List<Accounts_2> findByStatus(String status);
}
