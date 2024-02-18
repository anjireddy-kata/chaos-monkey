package com.techmonks.chaosmonkey.controller;

import com.techmonks.chaosmonkey.dto.AccountModel;
import com.techmonks.chaosmonkey.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("v1")
public class AccountController {

    private final AccountService accountService;

    @GetMapping("accounts/{accountId}")
    public ResponseEntity<AccountModel> getAccountDetailsById(@PathVariable("accountId") Long accountId) {
        AccountModel accountModel = accountService.getAccountDetailsById(accountId);
        return ResponseEntity.ok(accountModel);
    }
}
