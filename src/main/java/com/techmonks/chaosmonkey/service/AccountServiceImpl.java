package com.techmonks.chaosmonkey.service;

import com.techmonks.chaosmonkey.dto.AccountModel;
import com.techmonks.chaosmonkey.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;

    @Override
    public AccountModel getAccountDetailsById(Long accountId) {
        return accountRepository.getAccountDetailsById(accountId);
    }
}
