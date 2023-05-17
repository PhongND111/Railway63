package com.vti.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.vti.entity.Account;
import com.vti.form.AccountForUpdate;
import com.vti.form.AccountFormForCreating;

public interface IAccountService extends UserDetailsService {


	public void createAccount(AccountFormForCreating formForCreating);

	public void updateAccount(Short id, AccountForUpdate formForUpdating);

	public Account getAccountByID(short id);

	public void deleteAccountByID(short id);

	public Page<Account> getAllAccounts(Pageable pageable, String search);

	Account getAccountByUsername(String username);
}
