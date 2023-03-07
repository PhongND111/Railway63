package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.utils.ScannerUtils;

public class Demo {
	public static void main(String[] args)
			throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		// Khởi tạo AccountFunction
		AccountFunction accountFunction = new AccountFunction();
		while (true) {
			String leftAlignFormat = "| %-72s |%n";
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format("|                        MỜI BẠN CHỌN CHỨC NĂNG                            |%n");
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format(leftAlignFormat, "1. Hiển thị danh sách Account trên hệ thống"); // showAccount
			System.out.format(leftAlignFormat, "2. Tìm Account theo ID");// showAccountByID
			System.out.format(leftAlignFormat, "3. Update account theo ID");
			System.out.format(leftAlignFormat, "4. Xóa account theo ID");
			System.out.format(leftAlignFormat, "5. Tạo mới account");
			System.out.format(leftAlignFormat, "6. Exit");
			System.out.format("+--------------------------------------------------------------------------+%n");
			int chooseMenu = ScannerUtils.inputIntPositive();
			switch (chooseMenu) {
			case 1:
				accountFunction.showAccount();
				break;

			case 2:
				accountFunction.showAccountByID();
				break;

			case 3:
				accountFunction.updateAccountByID();
				break;
			case 4:
				accountFunction.deleteAccountByID();
				break;
			case 5:
				accountFunction.createAccount();
				break;
			case 6:
				System.out.println("Fin");
				return;
			default:
				System.out.println("Nhập lại:");
				break;
			}
		}
	}
}
