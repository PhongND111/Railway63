package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.AccountRepository;
import com.vti.backend.datalayer.IAccountRepository;
import com.vti.entity.Account;

public class AccountService implements IAccountService {
	private IAccountRepository accountRepository;

	public AccountService() throws FileNotFoundException, IOException {
		accountRepository = new AccountRepository();
	}

	@Override
	public List<Account> getListAccounts() throws ClassNotFoundException, SQLException {
		List<Account> listAccounts = accountRepository.getListAccounts();
		return listAccounts;
	}

	@Override
	public Account showAccountByID(int idShow) throws ClassNotFoundException, SQLException {
		return accountRepository.showAccountByID(idShow);
	}

	@Override
	public boolean deleteAccountByID(int id) throws ClassNotFoundException, SQLException {
		return accountRepository.deleteAccountByID(id);
	}

//	@Override
//	public boolean updateAccountByID(int id2) {
//		return accountRepository.updateAccountByID(id2);
//	}

	@Override
	public boolean updateEmailbyID(int i2, String emailNew) throws ClassNotFoundException, SQLException {
		return accountRepository.updateEmailbyID(i2, emailNew);
	}

	@Override
	public boolean createAccount(Account account, int depId, int posId) throws ClassNotFoundException, SQLException {
		if (accountRepository.createAccount(account, depId, posId)) {
			return true;
		} else {
		}
		return false;
	}

}
