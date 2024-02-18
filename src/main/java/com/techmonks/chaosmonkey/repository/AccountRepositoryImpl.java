package com.techmonks.chaosmonkey.repository;

import com.techmonks.chaosmonkey.dto.AccountModel;
import org.springframework.stereotype.Repository;
@Repository
public class AccountRepositoryImpl implements AccountRepository {

    @Override
    public AccountModel getAccountDetailsById(Long accountId) {
        AccountModel accountModel = new AccountModel();
        accountModel.setAccountId(accountId);
        accountModel.setAccountName("account name");
        accountModel.setAccountNumber("100234234234234");
        accountModel.setAccountType("Savings");
        return accountModel;
    }
}
