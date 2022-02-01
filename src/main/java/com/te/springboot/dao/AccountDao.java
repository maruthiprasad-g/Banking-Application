package com.te.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.te.springboot.dto.Account;
@Repository
public interface AccountDao extends JpaRepository<Account, Integer>{
	public Account findByAccId(int id);
}
