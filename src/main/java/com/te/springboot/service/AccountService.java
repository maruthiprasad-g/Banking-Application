package com.te.springboot.service;

import com.te.springboot.dto.Account;

public interface AccountService {


	public Account addAccount(Account account);
	
	public Account UpdateAccount(Account account);
	
	public void deleteAccount(int id);
	
	public Account AddAmount(Account account);
}
