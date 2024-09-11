package com.gk.smartfinacehub.entity;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class Account {
	@Id
	int accId;

	String bankholderName;

	String accountNumber;

	double balance;

	public Account() {
	}

	public Account(int accId, String bankholderName, String accountNumber, double balance) {
		super();
		this.accId = accId;
		this.bankholderName = bankholderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public String getBankholderName() {
		return bankholderName;
	}

	public void setBankholderName(String bankholderName) {
		this.bankholderName = bankholderName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accId=" + accId + ", bankholderName=" + bankholderName + ", accountNumber=" + accountNumber
				+ ", balance=" + balance + "]";
	}

}
