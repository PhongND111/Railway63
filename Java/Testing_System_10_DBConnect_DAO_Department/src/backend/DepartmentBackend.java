package backend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import DAO.DepartmentDAO;
import entity.Department;
import utils.ScannerUtils;

public class DepartmentBackend {

	private DepartmentDAO departmentDAO;

	public DepartmentBackend() throws FileNotFoundException, IOException {
		super();
		departmentDAO = new DepartmentDAO();
	}

	// khai báo hàm hiển thị danh sách department trong hệ thống
	public void showListDepartment() throws ClassNotFoundException, SQLException {
		List<Department> listDepartments = departmentDAO.getListDepartment();

		System.out.println("Danh sách phòng ban");
		System.out.println("Thông tin department đang có trên hệ thống: ");
		String leftAlignFormat = "| %-6d | %-21s |%n";

		System.out.format("+--------+-----------------------+%n");
		System.out.format("|   ID   | Department Name       |%n");
		System.out.format("+--------+-----------------------+%n");
		for (Department department2 : listDepartments) {
			System.out.format(leftAlignFormat, department2.getId(), department2.getNameString());

		}
		System.out.format("+--------+-----------------------+%n");

	}

	public void showDepartmentByID() throws ClassNotFoundException, SQLException {
		System.out.println("Nhập vào ID của phòng ban cần tìm");
		int idFind = ScannerUtils.inputIntPositive();
		Department departmentFindDepartment = departmentDAO.getDepartmentbyID(idFind);

		System.out.println("Danh sách phòng ban theo ID");
		System.out.println("Thông tin department theo ID đang có trên hệ thống: ");
		String leftAlignFormat = "| %-6d | %-21s |%n";

		System.out.format("+--------+-----------------------+%n");
		System.out.format("|   ID   | Department Name       |%n");
		System.out.format("+--------+-----------------------+%n");
		System.out.format(leftAlignFormat, departmentFindDepartment.getId(), departmentFindDepartment.getNameString());
		System.out.format("+--------+-----------------------+%n");

	}

}
