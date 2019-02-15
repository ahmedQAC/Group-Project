package com.qa.account.accountapi.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.qa.account.accountapi.persistence.domain.Account;

public interface AccountService {

	List<Account> getAllAccounts();

	Account getAnAccount(Long id);

	Account addAccount(Account account);

	ResponseEntity<Object> updateAccount(Account account, Long id);

}