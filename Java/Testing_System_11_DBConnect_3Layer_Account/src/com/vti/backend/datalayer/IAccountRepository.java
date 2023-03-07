package com.vti.backend.datalayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Account;

public interface IAccountRepository {

	List<Account> getListAccounts() throws ClassNotFoundException, SQLException;

	Account showAccountByID(int idShow) throws ClassNotFoundException, SQLException;

	boolean deleteAccountByID(int id) throws ClassNotFoundException, SQLException;

//	boolean updateAccountByID(int id2);

	boolean updateEmailbyID(int i2, String emailNew) throws ClassNotFoundException, SQLException;

	boolean createAccount(Account account, int depId, int posId) throws ClassNotFoundException, SQLException;

}
