package br.com.bean;

import java.math.BigDecimal;

public class Account {

	public enum AccountType {
		CHECKING_ACCOUNT;
	}

	private AccountType accountType;
	private Client client;
	private BigDecimal balance;

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public void add(Account acount) {

	}

}
