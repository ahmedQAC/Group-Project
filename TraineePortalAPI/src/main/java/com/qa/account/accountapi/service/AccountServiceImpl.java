package com.qa.account.accountapi.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.qa.account.accountapi.persistence.domain.Account;
import com.qa.account.accountapi.persistence.repository.AccountRepository;
import com.qa.account.accountapi.util.exceptions.AccountNotFoundException;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository repo;
	
	/* (non-Javadoc)
	 * @see com.qa.account.accountapi.service.AccountService#getAllAccounts()
	 */
	@Override
	public List<Account> getAllAccounts(){
		return repo.findAll();
	}
	
	/* (non-Javadoc)
	 * @see com.qa.account.accountapi.service.AccountService#getAnAccount(java.lang.Long)
	 */
	@Override
	public Account getAnAccount(Long id) {
		Optional<Account> account = repo.findById(id);
		return account.orElseThrow(() -> new AccountNotFoundException(id.toString()));
	}
	
	/* (non-Javadoc)
	 * @see com.qa.account.accountapi.service.AccountService#addAccount(com.qa.account.accountapi.persistence.domain.Account)
	 */
	@Override
	public Account addAccount(Account account) {
		return repo.save(account);
	}
	
	/* (non-Javadoc)
	 * @see com.qa.account.accountapi.service.AccountService#updateAccount(com.qa.account.accountapi.persistence.domain.Account, java.lang.Long)
	 */
	@Override
	public ResponseEntity<Object> updateAccount(Account account, Long id){
		if(accountExists(id)) {
			account.setAccountId(id);
			repo.save(account);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
	}
	
	private boolean accountExists(Long id) {
		Optional<Account> accountOptional = repo.findById(id);
		return accountOptional.isPresent();
	}
}
