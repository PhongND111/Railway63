package frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import backend.DepartmentBackend;

public class Demo {
	public static void main(String[] args)
			throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
//		jdbcUltis jdbcUltis = new jdbcUltis();
//		jdbcUltis.connnectionTestting();

		DepartmentBackend departmentBackend = new DepartmentBackend();
//		departmentBackend.showListDepartment();

		departmentBackend.showDepartmentByID();

	}
}
