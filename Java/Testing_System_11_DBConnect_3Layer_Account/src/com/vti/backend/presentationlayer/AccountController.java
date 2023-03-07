package com.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.AccountService;
import com.vti.backend.businesslayer.IAccountService;
import com.vti.entity.Account;

public class AccountController {

	private IAccountService accountService;

	public AccountController() throws FileNotFoundException, IOException {
		accountService = new AccountService();
	}

	public List<Account> getListAccount() throws ClassNotFoundException, SQLException {

		List<Account> listAccounts = accountService.getListAccounts();
		return listAccounts;
	}

	public Account showAccountByID(int idShow) {
		try {
			return accountService.showAccountByID(idShow);
		} catch (Exception e) {
			return null;
		}
	}

	public boolean deleteAccountByID(int id) throws ClassNotFoundException, SQLException {
		return accountService.deleteAccountByID(id);
	}

//	public boolean updateAccountByID(int id2) {
//		return accountService.updateAccountByID(id2);
//	}

	public boolean updateEmailbyID(int i2, String emailNew) throws ClassNotFoundException, SQLException {
		return accountService.updateEmailbyID(i2, emailNew);
	}

	public boolean createAccount(Account account, int depId, int posId) throws ClassNotFoundException, SQLException {
		if (accountService.createAccount(account, depId, posId)) {
			return true;
		} else {
			return false;
		}
	}

}
