package com.vti.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class jdbcUltis {
	private Properties property;
	private Connection connection;

	public jdbcUltis() throws FileNotFoundException, IOException {
		property = new Properties();
		property.load(new FileInputStream(
				"C:\\Users\\Phong\\eclipse-workspace\\Testing_System_11_DBConnect_3Layer_Account\\src\\com\\vti\\resources\\database.properties"));
	}

	// Method kiểm tra kết nối tới DB
	public void connnectionTestting() throws ClassNotFoundException, SQLException {
		String url = property.getProperty("url");
		String Username = property.getProperty("username");
		String password = property.getProperty("password");
		String dirver = property.getProperty("driver");

		Class.forName(dirver);
		connection = DriverManager.getConnection(url, Username, password);
		System.out.println("Connect Success");
	}

	// Method tạo kết nối DB
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		String url = property.getProperty("url");
		String Username = property.getProperty("username");
		String password = property.getProperty("password");
		String dirver = property.getProperty("driver");
		Class.forName(dirver);
		connection = DriverManager.getConnection(url, Username, password);
		return connection;
	}

	public void disConnection() throws SQLException {
		connection.close();
	}

	public ResultSet executeQuery(String sql) throws ClassNotFoundException, SQLException {
		Connection connnection = getConnection();
		Statement statement = connnection.createStatement();
		ResultSet result = statement.executeQuery(sql);
		return result;
	}

	public PreparedStatement createPrepareStatement(String sql) throws ClassNotFoundException, SQLException {
		Connection connnection = getConnection();
		PreparedStatement preStatement = connnection.prepareStatement(sql);
		return preStatement;
	}

}
