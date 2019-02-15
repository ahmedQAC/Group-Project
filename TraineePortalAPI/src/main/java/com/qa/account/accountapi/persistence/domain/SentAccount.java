package com.qa.account.accountapi.persistence.domain;

public class SentAccount {

	private Long accountId;
	
	private String username;
	
	private String password;
	
	public SentAccount() {
	}
	
	private SentMaterial sentMaterial;

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public SentMaterial getSentMaterial() {
		return sentMaterial;
	}

	public void setSentMaterial(SentMaterial sentMaterial) {
		this.sentMaterial = sentMaterial;
	}
	
	public SentAccount(Account account) {
		this.accountId = account.getAccountId();
		this.username = account.getUsername();
		this.password = account.getPassword();
		this.sentMaterial = new SentMaterial(account.getMaterial());
	}
	
}
