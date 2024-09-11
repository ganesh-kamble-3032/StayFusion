package com.gk.smartfinacehub.accountservice;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gk.smartfinacehub.accountdao.AccountDao;
import com.gk.smartfinacehub.entity.Account;

@Service
public class AccountService {
	@Autowired
	AccountDao accountdao;

	public Account getallAccount(int accId) {
		return accountdao.getallAccount(accId);

	}

	public ArrayList<Account> updateAccount() {
		return accountdao.updateAccount();

	}

	public ArrayList<Account> getAccountById() {
		return accountdao.getAccountById();

	}

	public ArrayList<Account> getAccountByName() {
		return accountdao.getAccountByName();

	}

	public Account createAccount(Account account) {
		return accountdao.createAccount();

	}

	public ArrayList<Account> deleteAccount() {
		return accountdao.deleteAccount();

	}

}
