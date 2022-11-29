package com.cinematicketsys.purchaseapi.dao;

import com.cinematicketsys.purchaseapi.model.Account;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AccountDao {
    int insertAccount(UUID id, Account account);

    default int insertAccount(Account account){
        UUID id = UUID.randomUUID();
        return insertAccount(id, account);
    }

    List<Account> selectAllAccount();

    Optional<Account> selectAccountById(UUID id);

    int deleteAccountById(UUID id);

    int updateAccountById(UUID id, Account account);

}
