package com.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Account;

public interface IAccountService {
	public List<Account> getListAccounts() throws ClassNotFoundException, SQLException;

	public Account showAccountByID(int idShow) throws ClassNotFoundException, SQLException;

	public boolean deleteAccountByID(int id) throws ClassNotFoundException, SQLException;

//	public boolean updateAccountByID(int id2);

	public boolean updateEmailbyID(int i2, String emailNew) throws ClassNotFoundException, SQLException;

	public boolean createAccount(Account account, int depId, int posId) throws ClassNotFoundException, SQLException;

}
