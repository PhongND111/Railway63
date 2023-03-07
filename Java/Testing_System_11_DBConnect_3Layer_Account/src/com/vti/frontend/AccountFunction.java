package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.presentationlayer.AccountController;
import com.vti.entity.Account;
import com.vti.utils.ScannerUtils;

public class AccountFunction {

	private AccountController accountController;

	public AccountFunction() throws FileNotFoundException, IOException {
		accountController = new AccountController();
	}

	// hiển thị list account
	public void showAccount() throws ClassNotFoundException, SQLException {
		System.out.println("Hiển thị danh sách account đang có trong hệ thống");
		List<Account> listAccounts = accountController.getListAccount();

		for (Account account : listAccounts) {
			System.out.println(account.toString());
		}
	}

// hiển thị account theo ID

	public void isAccountExistsByName() {
		System.out.println("Nhập vào tên muốn kiểm tra tồn tại");
	}

	public void showAccountByID() throws FileNotFoundException, IOException {
		System.out.println("Tìm kiếm account theo ID");
		System.out.println("Nhập ID của account cần tìm");
		int idShow = ScannerUtils.inputIntPositive();
		AccountController accountController = new AccountController();
		Account acc2 = accountController.showAccountByID(idShow);
		if (acc2 != null) {
			System.out.println(acc2.toString());
		} else {
			System.out.println("Không có account này trong hệ thống");
		}
	}

	public void deleteAccountByID() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		int id = getID();
		if (accountController.deleteAccountByID(id)) {
			System.out.println("Xóa thành công");
		} else {
			System.out.println("Không xóa thành công");
		}
	}

	public void updateAccountByID() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		System.out.println("Nhập vào trường muốn update");
		System.out.println("1.Email, 2.UserName, 3.FullName, 4.Department, 5.Position, 6.Exit");
		int i = ScannerUtils.inputIntPositive();
		switch (i) {
		case 1: // update theo email
			int i2 = getID();
			System.out.println("Nhập vào email mới");
			String emailNew = ScannerUtils.inputString();
			if (accountController.updateEmailbyID(i2, emailNew)) {
				System.out.println("Update email thành công");
			} else {
				System.out.println("Update email không thành công");
			}
			break;

		default:
			break;
		}
	}

	public int getID() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		AccountController accountController = new AccountController();
		while (true) {
			System.out.println("Nhập ID của account muốn xóa");
			int idDelete = ScannerUtils.inputIntPositive();
			Account accountsByID = accountController.showAccountByID(idDelete);
			if (accountsByID != null) {
				return idDelete;
			} else {
				System.out.println("ID vừa nhập không đúng. Mời nhập lại");
			}
		}
	}

	public void createAccount() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		Account account = new Account();
		System.out.println("Tạo account");
		System.out.println("Nhập email");
		account.setEmail(ScannerUtils.inputString());
		System.out.println("Nhập username");
		account.setUsername(ScannerUtils.inputString());
		System.out.println("Nhập full name");
		account.setFullName(ScannerUtils.inputString());
		System.out.println(
				"Chọn department theo ID: 1. Marketing, 2. Sale, 3. Bảo vệ, 4. Nhân sự, 5. Kỹ thuật, 6. Tài chính, 7. Phó giám đốc, 8. Giám đốc, 9. Thư kí, 10. No person, 11. Bán hàng");
		int depId = ScannerUtils.inputInt();
		System.out.println("Chọn position theo ID: 1. Dev, 2. Test, 3. Scrum Master, 4. PM");
		int posId = ScannerUtils.inputInt();
		AccountController accountController = new AccountController();
		if (accountController.createAccount(account, depId, posId)) {
			System.out.println("Tạo account thành công");
		} else {
			System.out.println("Tạo account không thành công");
		}
	}

}
