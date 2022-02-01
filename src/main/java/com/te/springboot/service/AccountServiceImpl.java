package com.te.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springboot.dao.AccountDao;
import com.te.springboot.dto.Account;
@Service 
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	public AccountDao dao;

	@Override
	public Account addAccount(Account account) {
		return dao.saveAndFlush(account);
	}

	@Override
	public Account UpdateAccount(Account account) {
		return dao.saveAndFlush(account); 
	}

	@Override
	public void deleteAccount(int id) {
		Account account = dao.findById(id).get();
		dao.delete(account);
	
	}

	@Override
	public Account AddAmount(Account account) {
		return dao.saveAndFlush(account);
	}
}
