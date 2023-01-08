package frontend;

import java.time.LocalDate;

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

	}
}
