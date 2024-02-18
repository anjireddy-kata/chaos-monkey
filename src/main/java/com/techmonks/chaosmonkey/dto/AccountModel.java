package com.techmonks.chaosmonkey.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountModel {
    private Long accountId;
    private String accountNumber;
    private String accountName;
    private String accountType;
}
