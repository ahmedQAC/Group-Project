package com.qa.account.accountapi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.qa.account.accountapi.persistence.domain.Account;
import com.qa.account.accountapi.service.AccountService;

@CrossOrigin
@RequestMapping("${path.base")
@RestController
public class AccountRest {

	@Autowired
	private AccountService service;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Value("${url.generator}")
	private String generatorURL;
	
	@Value("${path.getMaterials")
	private String getMaterials;
	
	@GetMapping("${path.getAllAccounts}")
	public List<Account> getAllAccounts(){
		return service.getAllAccounts();
	}
	
	@GetMapping("${path.getAnAccount}")
	public Account getAnAccount(@PathVariable Long id) {
		return service.getAnAccount(id);
	}
	
	@GetMapping("${path.updateAccount}")
	public ResponseEntity<Object> updateAccount(@RequestBody Account account, @PathVariable Long id){
		return service.updateAccount(account, id);
	}
}
