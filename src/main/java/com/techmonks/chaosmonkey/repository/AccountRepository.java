package com.techmonks.chaosmonkey.repository;

import com.techmonks.chaosmonkey.dto.AccountModel;

public interface AccountRepository {
    AccountModel getAccountDetailsById(Long accountId);
}
