package com.techmonks.chaosmonkey.service;

import com.techmonks.chaosmonkey.dto.AccountModel;

public interface AccountService {
    AccountModel getAccountDetailsById(Long accountId);
}
