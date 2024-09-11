package com.gk.smartfinacehub.accountdao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gk.smartfinacehub.entity.Account;

@Repository
public class AccountDao {
	
	
	@Autowired
	SessionFactory sessionfactory;

	public Account getallAccount(int accId) {

		Session session = sessionfactory.openSession();
		Account account = session.load(Account.class, accId);
		System.out.println(account);
		return account;
	}

	public ArrayList<Account> updateAccount() {

		return null;
	}

	public ArrayList<Account> getAccountById() {

		return null;
	}

	public ArrayList<Account> getAccountByName() {

		return null;
	}

	public Account createAccount() {

		return null;
	}

	public ArrayList<Account> deleteAccount() {

		return null;
	}

}
