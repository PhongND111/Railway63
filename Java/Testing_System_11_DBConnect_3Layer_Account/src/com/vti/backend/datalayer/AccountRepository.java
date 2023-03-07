package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Account;
import com.vti.utils.ScannerUtils;
import com.vti.utils.jdbcUltis;

public class AccountRepository implements IAccountRepository {

	private jdbcUltis jdbc;
	ScannerUtils scannerUtils = new ScannerUtils();

	public AccountRepository() throws FileNotFoundException, IOException {
		jdbc = new jdbcUltis();
	}

	@Override
	public List<Account> getListAccounts() throws ClassNotFoundException, SQLException {
// kết nối DB - lấy danh sách Account
		String sqlSelectString = "SELECT * FROM account;";
		ResultSet resultSet = jdbc.executeQuery(sqlSelectString);
		List<Account> listAccounts = new ArrayList<>();
		while (resultSet.next()) {
			Account account = new Account();
			account.setId(resultSet.getInt(1));
			account.setEmail(resultSet.getString(2));
			account.setUsername(resultSet.getString(3));
			account.setFullName(resultSet.getString(4));
			account.setCreateDate(resultSet.getDate(7).toLocalDate());
			listAccounts.add(account);

		}
		return listAccounts;
	}

	@Override
	public Account showAccountByID(int idShow) throws ClassNotFoundException, SQLException {
		String sqlString = "SELECT * FROM testingsystem.account WHERE AccountID = ?;";
		PreparedStatement preparedStatement = jdbc.createPrepareStatement(sqlString);
		preparedStatement.setInt(1, idShow);
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			Account account = new Account();
			account.setId(resultSet.getInt(1));
			account.setEmail(resultSet.getString(2));
			account.setUsername(resultSet.getString(3));
			account.setFullName(resultSet.getString(4));

			LocalDate lcDate = resultSet.getDate(7).toLocalDate();
			account.setCreateDate(lcDate);
			return account;
		} else {
			return null;
		}
	}

	@Override
	public boolean deleteAccountByID(int id) throws ClassNotFoundException, SQLException {
		String sqlDeleteID = "DELETE FROM testingsystem.account WHERE AccountID = ?;";
		PreparedStatement preparedStatement = jdbc.createPrepareStatement(sqlDeleteID);
		preparedStatement.setInt(1, id);
		int result = preparedStatement.executeUpdate();
		if (result == 1) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean updateEmailbyID(int i2, String emailNew) throws ClassNotFoundException, SQLException {
		String sql2 = "UPDATE testingsystem.account SET Email = (?) WHERE AccountID = (?);";
		PreparedStatement preparedStatement2 = jdbc.createPrepareStatement(sql2);
		preparedStatement2.setString(1, emailNew);
		preparedStatement2.setInt(2, i2);
		int result2 = preparedStatement2.executeUpdate();
		if (result2 == 1) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean createAccount(Account account, int depId, int posId) throws ClassNotFoundException, SQLException {
		String sqlString = "INSERT INTO account (Email, Username, FullName, DepartmentID, PositionID, CreateDate) VALUES (?, ?, ?,?,?,now());";
		PreparedStatement preparedStatement = jdbc.createPrepareStatement(sqlString);
		preparedStatement.setString(1, account.getEmail());
		preparedStatement.setString(2, account.getUsername());
		preparedStatement.setString(3, account.getFullName());
		preparedStatement.setInt(4, depId);
		preparedStatement.setInt(5, posId);
		int result = preparedStatement.executeUpdate();
		if (result == 1) {
			return true;
		} else {
			return false;
		}
	}

}
