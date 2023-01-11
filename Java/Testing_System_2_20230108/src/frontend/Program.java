package frontend;

import java.time.LocalDate;
import java.util.Scanner;

import entity.Account;
import entity.Answer;
import entity.CategoryName;
import entity.CategoryQuestion;
import entity.Department;
import entity.Exam;
import entity.Group;
import entity.Position;
import entity.PositionName;
import entity.Question;
import entity.TypeName;
import entity.TypeQuestion;

public class Program {
	public static void main(String[] args) {

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

//		Tạo Group instance
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Nhom 1";
		group1.creator = account1;
		group1.createDate = LocalDate.of(2022, 12, 1);

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Nhom 2";
		group2.creator = account1;
		group2.createDate = LocalDate.of(2022, 12, 1);

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "Nhom 3";
		group3.creator = account1;
		group3.createDate = LocalDate.of(2022, 12, 1);

// Tạo group mà account1 thuộc về
		Group[] account1Groups = new Group[3];
		account1Groups[0] = group1;
		account1Groups[1] = group2;
		account1Groups[2] = group3;
		account1.groups = account1Groups;
//		System.out.println("Thong tin group cua account 1: " + account1.groups[1].name);

		Group[] account2Groups = new Group[2];
		account2Groups[0] = group1;
		account2Groups[1] = group2;
		account2.groups = account2Groups;

// Add account vào group		
		Account[] group1Accounts = { account1, account2 };
		group1.accounts = group1Accounts;
		System.out.println("Thong tin account thuoc group1: " + group1Accounts[0].fullName);

////		In Dept 1
//		System.out.println("Thong tin department");
//		System.out.println("ID: " + department1.id);
//		System.out.println("Name: " + department1.name);
//		System.out.println("\n");
//
////		In Position instance
//		System.out.println("Thong tin vi tri");
//		System.out.println("ID: " + position1.id);
//		System.out.println("Name: " + position1.name);
//		System.out.println("\n");
//
////		In Account instance
//		System.out.println("Thong tin account");
//		System.out.println("ID: " + account1.id);
//		System.out.println("Email: " + account1.email);
//		System.out.println("Name: " + account1.fullName);
//		System.out.println("Department: " + account1.department.name);
//		System.out.println("Position: " + account1.position.name);
//		System.out.println("Ngay tao: " + account1.createDate);
//		System.out.println("\n");
//
////		In Group instance
//		System.out.println("Thong tin group");
//		System.out.println("ID: " + group1.id);
//		System.out.println("Ten nhom: " + group1.name);
//		System.out.println("ID nguoi tao: " + group1.creator.fullName);
//		System.out.println("Ngay tao: " + group1.createDate);
//
//		String[] nameArrayStrings = new String[3];
//		nameArrayStrings[0] = "A";
//		nameArrayStrings[1] = "B";
//		nameArrayStrings[2] = "C";
//
//		System.out.println(nameArrayStrings[1]);
//
//		String[] nameArrayStrings_2 = { "C", "D", "E" };
//		System.out.println(nameArrayStrings_2[2]);

// Create TypeQuestion instance
		TypeQuestion typeQuestion1 = new TypeQuestion();
		typeQuestion1.id = 1;
		typeQuestion1.type = TypeName.Essay;

		TypeQuestion typeQuestion2 = new TypeQuestion();
		typeQuestion2.id = 2;
		typeQuestion2.type = TypeName.Multiple_Choice;

// Create CategoryQuestion instance
		CategoryQuestion categoryQuestion1 = new CategoryQuestion();
		categoryQuestion1.id = 1;
		categoryQuestion1.name = CategoryName.dotNET;

		CategoryQuestion categoryQuestion2 = new CategoryQuestion();
		categoryQuestion2.id = 2;
		categoryQuestion2.name = CategoryName.Java;

		CategoryQuestion categoryQuestion3 = new CategoryQuestion();
		categoryQuestion3.id = 3;
		categoryQuestion3.name = CategoryName.Postman;

		CategoryQuestion categoryQuestion4 = new CategoryQuestion();
		categoryQuestion4.id = 4;
		categoryQuestion4.name = CategoryName.Ruby;

		CategoryQuestion categoryQuestion5 = new CategoryQuestion();
		categoryQuestion5.id = 5;
		categoryQuestion5.name = CategoryName.SQL;

// Create Question instance
		Question question1 = new Question();
		question1.id = 1;
		question1.content = "Question 1 content?";
		question1.category = categoryQuestion2;
		question1.type = typeQuestion2;
		question1.creator = account1;
		question1.createDate = LocalDate.now();

		Question question2 = new Question();
		question2.id = 2;
		question2.content = "Question 2 content?";
		question2.category = categoryQuestion3;
		question2.type = typeQuestion1;
		question2.creator = account2;
		question2.createDate = LocalDate.now();

		Question question3 = new Question();
		question3.id = 3;
		question3.content = "Question 3 content?";
		question3.category = categoryQuestion1;
		question3.type = typeQuestion2;
		question3.creator = account1;
		question3.createDate = LocalDate.now();

// Create Answer instance
		Answer answer1 = new Answer();
		answer1.id = 1;
		answer1.content = "Answer 1 content";
		answer1.question = question1;
		answer1.isCorrect = true;

		Answer answer2 = new Answer();
		answer2.id = 2;
		answer2.content = "Answer 2 content";
		answer2.question = question1;
		answer2.isCorrect = true;

		Answer answer3 = new Answer();
		answer3.id = 3;
		answer3.content = "Answer 3 content";
		answer3.question = question1;
		answer3.isCorrect = false;

		Answer answer4 = new Answer();
		answer4.id = 4;
		answer4.content = "Answer 4 content";
		answer4.question = question2;
		answer4.isCorrect = false;

		Answer answer5 = new Answer();
		answer5.id = 5;
		answer5.content = "Answer 5 content";
		answer5.question = question2;
		answer5.isCorrect = false;

		Answer answer6 = new Answer();
		answer6.id = 6;
		answer6.content = "Answer 6 content";
		answer6.question = question2;
		answer6.isCorrect = true;

// Create Exam
		Exam exam1 = new Exam();
		exam1.id = 1;
		exam1.code = "E1";
		exam1.title = "Exam 1";
		exam1.categoryQuestion = categoryQuestion1;
		exam1.duration = 60;
		exam1.creator = account1;
		exam1.createDate = LocalDate.now();

		Exam exam2 = new Exam();
		exam2.id = 2;
		exam2.code = "E2";
		exam2.title = "Exam 2";
		exam2.categoryQuestion = categoryQuestion1;
		exam2.duration = 60;
		exam2.creator = account1;
		exam2.createDate = LocalDate.now();

		Exam exam3 = new Exam();
		exam3.id = 3;
		exam3.code = "E3";
		exam3.title = "Exam 3";
		exam3.categoryQuestion = categoryQuestion1;
		exam3.duration = 60;
		exam3.creator = account2;
		exam3.createDate = LocalDate.now();

		Exam exam4 = new Exam();
		exam4.id = 4;
		exam4.code = "E4";
		exam4.title = "Exam 4";
		exam4.categoryQuestion = categoryQuestion2;
		exam4.duration = 60;
		exam4.creator = account1;
		exam4.createDate = LocalDate.now();

// Create ExamQuestion
		Question[] questionArray1 = { question1, question2, question3 };
		exam1.questions = questionArray1;

		System.out.println("Thong tin de thi va cau hoi");
		System.out.println("Ma de thi: " + exam1.code);
		System.out.println("Cau hoi:");
		System.out.println("Cau hoi 1: " + exam1.questions[0].content);
		System.out.println("Cau hoi 2: " + exam1.questions[1].content);
		System.out.println("Cau hoi 3: " + exam1.questions[2].content);
//-----------------------------------------------------------------
// Exercise 1 - Question 1
//		Kiểm tra account thứ 2
//		Nếu không có phòng ban (tức là department == null) thì sẽ in ra text
//		"Nhân viên này chưa có phòng ban"
//		Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là ..."	
		System.out.println("\n");
		System.out.println("-------------Exercise 1 - Question 1--------------");
		if (account2.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		} else {
			System.out.println("Phòng ban của nhân viên này là: " + account2.department.name);
		}

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

//	Exercise 1 - Question 3:
//			Sử dụng toán tử ternary để làm Question 1
		System.out.println("\n");
		System.out.println("-------------Exercise 1 - Question 3--------------");
		System.out.println(account2.department == null ? "Nhân viên này chưa có phòng ban"
				: "Phòng ban của nhân viên này là: " + account2.department.name);

//		Exercise 1 - Question 4:
//			Sử dụng toán tử ternary để làm yêu cầu sau:
//			Kiểm tra Position của account thứ 1
//			Nếu Position = Dev thì in ra text "Đây là Developer"
//			Nếu không phải thì in ra text "Người này không phải là Developer"		
		System.out.println("\n");
		System.out.println("-------------Exercise 1 - Question 4--------------");
		System.out.println(
				account1.position.name == PositionName.Dev ? "Đây là Developer" : "Người này không phải là Developer");

// Switch case		
// Exercise 1 - Question 5
//		Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
//			Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
//			Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
//			Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
//			Còn lại in ra "Nhóm có nhiều thành viên"	
		System.out.println("\n");
		System.out.println("-------------Exercise 1 - Question 5--------------");
		if (group1.accounts == null) {
			System.out.println("Nhóm chưa có thành viên nào.");
		} else {
//			int accNum = group1.accounts.length;
//			switch (accNum) {
			switch (group1.accounts.length) {
			case 1:
				System.out.println("Nhóm có một thành viên");
				break;
			case 2:
				System.out.println("Nhóm có hai thành viên");
				break;
			case 3:
				System.out.println("Nhóm có ba thành viên");
				break;
			default:
				System.out.println("Nhóm có nhiều thành viên");
				break;
			}
		}

// Exercise 1 - Question 6:
//			Sử dụng switch case để làm lại Question 2		
		System.out.println("\n");
		System.out.println("-------------Exercise 1 - Question 6--------------");
		switch (account2.groups.length) {
		case 0:
			System.out.println("Nhân viên này chưa có group");
			break;
		case 1:
			System.out
					.println("Group của nhân viên này là: " + account2.groups[0].name + ", " + account2.groups[1].name);
			break;
		case 2:
			System.out
					.println("Group của nhân viên này là: " + account2.groups[0].name + ", " + account2.groups[1].name);
			break;
		case 3:
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			break;
		case 4:
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
			break;
		default:
			break;
		}

// Foreach
// Exercise 1 - Question 8
//		In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ
		System.out.println("\n");
		System.out.println("-------------Exercise 1 - Question 8--------------");
		Account[] accounts = { account1, account2, account3 };
		for (Account account : accounts) {
			System.out.println(account);
		}

// Exercise 1 - Question 9
//		In ra thông tin các phòng ban bao gồm: id và name
		System.out.println("\n");
		System.out.println("-------------Exercise 1 - Question 9--------------");
		Department[] departmentsQ9 = { department1, department2, department3, department4, department5 };
		for (Department departmentElement : departmentsQ9) {
			System.out.println(departmentElement);
		}

// Exercise 1 - Question 10:
//			In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
//			họ theo định dạng như sau:
//			Thông tin account thứ 1 là:
//			Email: NguyenVanA@gmail.com
//			Full name: Nguyễn Văn A
//			Phòng ban: Sale
		System.out.println("\n");
		System.out.println("-------------Exercise 1 - Question 10--------------");
		Account[] accountsQ10 = { account1, account2, account3 };
		for (int i = 0; i < accountsQ10.length; i++) {
			System.out.println("Thông tin account thứ " + (i + 1) + " là:");
			System.out.println("Email: " + accountsQ10[i].email);
			System.out.println("Full name: " + accountsQ10[i].fullName);
			System.out.println("Phòng ban: " + accountsQ10[i].department);
			System.out.println("\n");
		}

// Exercise 1 - Question 11
//		In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
//			Thông tin department thứ 1 là:
//			Id: 1
//			Name: Sale
//			Thông tin department thứ 2 là:
//			Id: 2
//			Name: Marketing
		System.out.println("\n");
		System.out.println("-------------Exercise 1 - Question 11--------------");
		Department[] departmentsQ11 = { department1, department2, department3, department4, department5 };
		for (int i = 0; i < departmentsQ11.length; i++) {
			System.out.println(departmentsQ11[i]);
		}

// Exercise 1 - Question 12
//		Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
		System.out.println("\n");
		System.out.println("-------------Exercise 1 - Question 12--------------");
		Department[] departmentsQ12 = { department1, department2, department3, department4, department5 };
		for (int i = 0; i < departmentsQ12.length; i++) {
			if (departmentsQ12[i].id == 1 || departmentsQ12[i].id == 2) {
				System.out.println(departmentsQ12[i]);
			}
		}

// Exercise 1 - Question 13:
//			In ra thông tin tất cả các account ngoại trừ account thứ 2
		System.out.println("\n");
		System.out.println("-------------Exercise 1 - Question 13--------------");
		Department[] departmentsQ13 = { department1, department2, department3, department4, department5 };
		for (int i = 0; i < departmentsQ13.length; i++) {
			if (departmentsQ13[i].id == 2) {
				continue;
			}
			System.out.println(departmentsQ13[i]);
		}
// Exercise 1 - Question 14
//		In ra thông tin tất cả các account có id < 4
		System.out.println("\n");
		System.out.println("-------------Exercise 1 - Question 14--------------");
		Account[] accountsQ14 = { account1, account2, account3, account4, account5 };
		for (int i = 0; i < accountsQ14.length; i++) {
			if (accountsQ14[i].id < 4) {
				System.out.println("Thông tin account thứ " + (i + 1) + " là:");
				System.out.println("Email: " + accountsQ14[i].email);
				System.out.println("Full name: " + accountsQ14[i].fullName);
				System.out.println("Phòng ban: " + accountsQ14[i].department);
				System.out.println("\n");
			}
		}
// Exercise 1 - Question 15:
//			In ra các số chẵn nhỏ hơn hoặc bằng 20
		System.out.println("\n");
		System.out.println("-------------Exercise 1 - Question 15--------------");
		for (int i = 0; i < 21; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

// Exercise 1 - Question 16-11 // WHILE
//		In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
//		Thông tin department thứ 1 là:
//		Id: 1
//		Name: Sale
		System.out.println("\n");
		System.out.println("-------------Exercise 1 - Question 16-11--------------");
		Department[] departments = { department1, department2, department3 };
		int i = 0;
		while (i < departments.length) {
			System.out.println("Thông tin department thứ " + (i + 1) + " là:");
			System.out.println("ID: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
			System.out.println("\n");
			i++;
		}

// Exercise 1 - Question 16-12 // WHILE
//		Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
//		System.out.println("\n");
//		System.out.println("-------------Exercise 1 - Question 16-12--------------");
		System.out.println("\n");
		System.out.println("-------------Exercise 1 - Question 16-12--------------");
		Department[] departmentsQ1612 = { department1, department2, department3, department4, department5 };
		int i12 = 0;
		while (departmentsQ1612[i12].id == 1 || departmentsQ1612[i12].id == 2) {
			System.out.println(departmentsQ1612[i12]);
			i12++;
		}
// Exercise 1 - Question 16-13 // WHILE
//		In ra thông tin tất cả các account ngoại trừ account thứ 2
		System.out.println("\n");
		System.out.println("-------------Exercise 1 - Question 16-13--------------");
		Department[] departmentsQ1613 = { department1, department2, department3, department4, department5 };
		int i13 = 0;
		while (i13 < departmentsQ1613.length) {
			if (departmentsQ1613[i13].id != 2) {
				System.out.println(departmentsQ1613[i13]);
			}
			i13++;
		}

//		Exercise 5: Input from console
// Exercise 5 - Question 1
//		Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình
//		System.out.println("\n");
//		System.out.println("-------------Exercise 5 - Question 1--------------");
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Moi nhap vao 3 so nguyen");
//		System.out.println("Moi nhap so nguyen thu 1");
//		int so1 = scanner.nextInt();
//		System.out.println("Moi nhap so nguyen thu 2");
//		int so2 = scanner.nextInt();
//		System.out.println("Moi nhap so nguyen thu 3");
//		int so3 = scanner.nextInt();
//		System.out.println("3 so nguyen ban da nhap vao lan luot la: " + so1 + ", " + so2 + ", " + so3 + ".");

// Exercise 5 - Question 6
//		Viết lệnh cho phép người dùng tạo department (viết thành method)
//		System.out.println("\n");
//		System.out.println("-------------Exercise 5 - Question 6--------------");
//		Scanner scannerQ6 = new Scanner(System.in);
//		try {
//			System.out.println("Tao department moi");
//			System.out.println("Moi ban nhap vao id:");
//			int a = scannerQ6.nextInt();
//			scannerQ6.nextLine();
//			System.out.println("Moi ban nhap vao ten department");
//			String bString = scannerQ6.nextLine();
//
//			Department departmentNewDepartment = new Department();
//			departmentNewDepartment.id = a;
//			departmentNewDepartment.name = bString;
//
//			System.out.println("Thong tin department moi tao:");
//			System.out.println(departmentNewDepartment);
//
//		} finally {
//			scannerQ6.close();
//		}
// lý do dùng hàm .close() là để tránh error "Resource leak"

// Exercise 5 - Question 5
//			Viết lệnh cho phép người dùng tạo account (viết thành method)
//			Đối với property Position, Người dùng nhập vào 1 2 3 4 5 và vào
//			chương trình sẽ chuyển thành Position.Dev, Position.Test,
//			Position.ScrumMaster, Position.PM		
		System.out.println("\n");
		System.out.println("-------------Exercise 5 - Question 5--------------");
		Scanner scannerQ5 = new Scanner(System.in);
		System.out.println("Moi nhap thong tin account");
		System.out.println("Moi nhap thong tin id");
		int idQ5 = scannerQ5.nextInt();
		System.out.println("Moi nhap thong tin email");
		String emailQ5 = scannerQ5.next();
		System.out.println("Moi nhap ho ten");
		String fullNameQ5 = scannerQ5.next();
		System.out.println("Moi nhap thong tin department");
		int depQ5 = scannerQ5.nextInt();
		System.out.println("Moi nhap thong tin position id, trong 1 la Dev, 2 la PM");
		int posQ5 = scannerQ5.nextInt();

		switch (posQ5) {
		case 1:
			Account accountNewAccount = new Account();
			accountNewAccount.id = idQ5;
			accountNewAccount.email = emailQ5;
			accountNewAccount.fullName = fullNameQ5;
			accountNewAccount.department = department1; // chưa xử lý được đoạn này
			accountNewAccount.position = position1;
			System.out.println(accountNewAccount);
			break;
		case 2:
			Account accountNewAccount2 = new Account();
			accountNewAccount2.id = idQ5;
			accountNewAccount2.email = emailQ5;
			accountNewAccount2.fullName = fullNameQ5;
			accountNewAccount2.department = department1;
			accountNewAccount2.position = position2;
			System.out.println(accountNewAccount2);
			break;
		default:
			break;
		}
	}
}
