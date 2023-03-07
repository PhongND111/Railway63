package backend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import utils.ScannerUtils;
import utils.jdbcUltis;

public class Exercise1Backend {

	private jdbcUltis jdbc;

	public Exercise1Backend() throws FileNotFoundException, IOException {
		super();
		jdbc = new jdbcUltis();
	}

	public void question1() throws ClassNotFoundException, SQLException {
		System.out.println("Test kết nối.");
		jdbc.connnectionTestting();

	}

	// Tạo method để in ra các thông tin của position gồm có id, name
	public void question2() throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM position;";
		ResultSet posResult = jdbc.executeQuery(sql);
		System.out.println("Thông tin Position đang có trên hệ thống: ");
		String leftAlignFormat = "| %-6d | %-21s |%n";

		System.out.format("+--------+-----------------------+%n");
		System.out.format("|   ID   | PositionName          |%n");
		System.out.format("+--------+-----------------------+%n");
		while (posResult.next()) {
			System.out.format(leftAlignFormat, posResult.getInt(1), posResult.getString(2));
		}
		System.out.format("+--------+-----------------------+%n");

	}

	// Tạo position mới
	public void question3() throws ClassNotFoundException, SQLException {
		System.out.println("Thêm position mới");
		String sqlInsertPosition = "INSERT INTO position (PositionName) VALUES (?);";

		System.out.println("Nhập position: 'Dev', 'Test', 'ScrumMaster', 'PM'");
		String positionInput = ScannerUtils.inputString();

		PreparedStatement preparedStatement = jdbc.createPrepareStatement(sqlInsertPosition);
		preparedStatement.setString(1, positionInput);

		int result = preparedStatement.executeUpdate();

		if (result == 1) {
			System.out.println("Tạo position thành công");
			question2();
		} else {
			System.out.println("Tạo position không thành công");
		}
	}

	// Question 4:
	// Tạo method để update tên của position gồm có id = 5 thành "Dev".
	public void question4() throws ClassNotFoundException, SQLException {
		System.out.println("\n");
		System.out.println("Question 4: Update tên của position gồm có id = 5 thành \"Dev\"");
		String updatePositionNameString = "UPDATE position SET PositionName = (?) WHERE PositionID = (?);";

		PreparedStatement preparedStatement2 = jdbc.createPrepareStatement(updatePositionNameString);
		String positionNameString = "Dev";
		int id = 5;

		preparedStatement2.setString(1, positionNameString);
		preparedStatement2.setInt(2, id);

		int resultQuestion4 = preparedStatement2.executeUpdate();

		if (resultQuestion4 == 1) {
			System.out.println("Update thành công");
			question2();
		} else {
			System.out.println("Update không thành công");
		}

	}
}
