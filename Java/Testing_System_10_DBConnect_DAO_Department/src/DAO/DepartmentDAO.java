package DAO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Department;
import utils.jdbcUltis;

public class DepartmentDAO {
	public jdbcUltis jdbc;

	public DepartmentDAO() throws FileNotFoundException, IOException {
		super();
		jdbc = new jdbcUltis();
	}

	// hàm lấy department từ DB
	public List<Department> getListDepartment() throws ClassNotFoundException, SQLException {
// kết nối đến DB và lấy dữ liệu bảng Department
		String sqlSelectDepartment = "SELECT * FROM department;";
		ResultSet resultSetDepartment = jdbc.executeQuery(sqlSelectDepartment);

// tạo mảng động để lưu dữ liệu lấy từ DB
		List<Department> listDepartments = new ArrayList<>();

// chuyển resultSetDepartmentResultSet thành listDepartments
		while (resultSetDepartment.next()) {
			Department department = new Department();
			department.setId(resultSetDepartment.getInt(1));
			department.setNameString(resultSetDepartment.getString(2));

			listDepartments.add(department);
		}
		return listDepartments;

	}

	public Department getDepartmentbyID(int idFind) throws ClassNotFoundException, SQLException {
		String sqlString = "SELECT * FROM Department WHERE DepartmentID = ?;";
		PreparedStatement preparedStatement = jdbc.createPrepareStatement(sqlString);
		preparedStatement.setInt(1, idFind);

		ResultSet resultSetDepartmentByID = preparedStatement.executeQuery();
		if (resultSetDepartmentByID.next()) {
			Department department = new Department();
			department.setId(resultSetDepartmentByID.getInt(1));
			department.setNameString(resultSetDepartmentByID.getString(2));
			return department;

		} else {
			return null;

		}
	}

}
