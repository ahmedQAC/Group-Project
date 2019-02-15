package com.qa.account.accountapi.persistence.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Account {
	@Id
	@GeneratedValue
	private Long accountId;
	
	private String username;
	
	private String password;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Material material;
	
	public Account() {
	}
	
	public Account(Long accountId, String username, String password) {
		this.accountId = accountId;
		this.username = username;
		this.password = password;
	}

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

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}
}
