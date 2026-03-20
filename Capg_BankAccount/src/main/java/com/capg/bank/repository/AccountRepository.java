package com.capg.bank.repository;

import com.capg.bank.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    //find by email
    Account findByHolderEmail(String holderEmail);
    //find account by holder name
    List<Account> findByAccountHolderName(String AccountHolderName);

    //JPQL QUERIES
    //get account by type
    @Query("SELECT a FROM Account WHERE a.accountType = :type")
    List<Account> getAccountByType(@Param("type") String type);

}
