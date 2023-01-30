package backend;

import java.time.LocalDate;

import entity.Account;
import entity.Department;
import entity.Position;
import entity.PositionName;

public class Exercise1 {

	// Exercise 1 - Question 1
//	Kiểm tra account thứ 2
//	Nếu không có phòng ban (tức là department == null) thì sẽ in ra text
//	"Nhân viên này chưa có phòng ban"
//	Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là ..."	
	public void question1() {
//		Tạo Department instance
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Sale";

		Department department2 = new Department();
		department2.id = 2;
		department2.name = "HR";

		Department department3 = new Department();
		department3.id = 3;
		department3.name = "Marketing";

		Department department4 = new Department();
		department4.id = 4;
		department4.name = "Development";

		Department department5 = new Department();
		department5.id = 5;
		department5.name = "QA";

//		Tạo Position instance
		Position position1 = new Position();
		position1.id = 1;
		position1.name = PositionName.Dev;

		Position position2 = new Position();
		position2.id = 2;
		position2.name = PositionName.PM;

//		Tạo Account instance
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "abc@gmail.com";
		account1.fullName = "Nguyen Van A";
		account1.department = department1;
		account1.position = position1;
		account1.createDate = LocalDate.now();

		Account account2 = new Account();
		account2.id = 2;
		account2.email = "abc2@gmail.com";
		account2.fullName = "Nguyen Van B";
		account2.department = department1;
		account2.position = position1;
		account2.createDate = LocalDate.now();

		Account account3 = new Account();
		account3.id = 3;
		account3.email = "abc3@gmail.com";
		account3.fullName = "Nguyen Van C";
		account3.department = department1;
		account3.position = position2;
		account3.createDate = LocalDate.now();

		Account account4 = new Account();
		account4.id = 4;
		account4.email = "abc4@gmail.com";
		account4.fullName = "Nguyen Van D";
		account4.department = department3;
		account4.position = position1;
		account4.createDate = LocalDate.now();

		Account account5 = new Account();
		account5.id = 5;
		account5.email = "abc5@gmail.com";
		account5.fullName = "Nguyen Van E";
		account5.department = department2;
		account5.position = position1;
		account5.createDate = LocalDate.now();

		if (account2.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		} else {
			System.out.println("Phòng ban của nhân viên này là: " + account2.department.name);
		}
	}

	public void question2() {
//		Tạo Department instance
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Sale";

		Department department2 = new Department();
		department2.id = 2;
		department2.name = "HR";

		Department department3 = new Department();
		department3.id = 3;
		department3.name = "Marketing";

		Department department4 = new Department();
		department4.id = 4;
		department4.name = "Development";

		Department department5 = new Department();
		department5.id = 5;
		department5.name = "QA";

//		Tạo Position instance
		Position position1 = new Position();
		position1.id = 1;
		position1.name = PositionName.Dev;

		Position position2 = new Position();
		position2.id = 2;
		position2.name = PositionName.PM;

//		Tạo Account instance
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "abc@gmail.com";
		account1.fullName = "Nguyen Van A";
		account1.department = department1;
		account1.position = position1;
		account1.createDate = LocalDate.now();

		Account account2 = new Account();
		account2.id = 2;
		account2.email = "abc2@gmail.com";
		account2.fullName = "Nguyen Van B";
		account2.department = department1;
		account2.position = position1;
		account2.createDate = LocalDate.now();

		Account account3 = new Account();
		account3.id = 3;
		account3.email = "abc3@gmail.com";
		account3.fullName = "Nguyen Van C";
		account3.department = department1;
		account3.position = position2;
		account3.createDate = LocalDate.now();

		Account account4 = new Account();
		account4.id = 4;
		account4.email = "abc4@gmail.com";
		account4.fullName = "Nguyen Van D";
		account4.department = department3;
		account4.position = position1;
		account4.createDate = LocalDate.now();

		Account account5 = new Account();
		account5.id = 5;
		account5.email = "abc5@gmail.com";
		account5.fullName = "Nguyen Van E";
		account5.department = department2;
		account5.position = position1;
		account5.createDate = LocalDate.now();

		// Exercise 1 - Question 2
//		Kiểm tra account thứ 2
//		Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
//		Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên
//		này là Java Fresher, C# Fresher"
//		Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người
//		quan trọng, tham gia nhiều group"
//		Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là
//		người hóng chuyện, tham gia tất cả các group"
		System.out.println("\n");
		System.out.println("-------------Exercise 1 - Question 2--------------");
//		int soGroupAcc2 = account2.groups.length;
		if (account2.groups == null) {
			System.out.println("Nhân viên này chưa có group");
		} else if (account2.groups.length == 1 || account2.groups.length == 2) {
			System.out
					.println("Group của nhân viên này là: " + account2.groups[0].name + ", " + account2.groups[1].name);
		} else if (account2.groups.length == 3) {
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
		} else if (account2.groups.length == 4) {
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}

	}
}
