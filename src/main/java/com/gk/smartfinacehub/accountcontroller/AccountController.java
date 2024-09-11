package com.gk.smartfinacehub.accountcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gk.smartfinacehub.accountservice.AccountService;
import com.gk.smartfinacehub.entity.Account;

@RestController
public class AccountController {
	@Autowired
	AccountService accountservice;

	@GetMapping("getsllaccount/{accId}")
	public Account getallAccount(@PathVariable("accId") int accId) {
		return accountservice.getallAccount(accId);

	}
	 @PostMapping("createaccount")
	    public Account createAccount(@RequestBody Account account) {
	        return accountservice.createAccount(account);
	    }
}
