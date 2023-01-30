package backend;

import java.time.LocalDate;

import entity.Account;

public class E1_Q1 {
	public static void main(String[] args) {
		// Exercise 1 - Question 1
//	Kiểm tra account thứ 2
//	Nếu không có phòng ban (tức là department == null) thì sẽ in ra text
//	"Nhân viên này chưa có phòng ban"
//	Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là ..."	
		Account account2 = new Account();
		account2.id = 2;
		account2.email = "abc2@gmail.com";
		account2.fullName = "Nguyen Van B";
		account2.department = ;
		account2.position = position1;
		account2.createDate = LocalDate.now();

		System.out.println("\n");
		System.out.println("-------------Exercise 1 - Question 1--------------");
		if (frontend.Program.account2.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		} else {
			System.out.println("Phòng ban của nhân viên này là: " + account2.department.name);
		}
	}
}
