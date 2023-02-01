package com.vti.frontend;

import java.time.LocalDate;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Position;

public class Demo_20230201 {
	public static void main(String[] args) {
		// Datatype - Kiểu dữ liệu
// int, float, char, String,... => kiểu dữ liệu nguyên thủy (primitive)
		// Integer, FLoat,... => kiểu wrapper

		int i1 = 5;
		Integer i2 = 10;

		// Boxing
		Integer i3 = i1;

		// Unboxing
		Float float1 = 5f;
		float f2 = float1.floatValue();

		// casting
		float f3 = 103.45f;

		// Question 1
		Department department1 = new Department();

		Department department2 = new Department("Sales");
		System.out.println(department2.toString());

		Department department3 = new Department(3, "Dev");
		System.out.println(department3.toString());
		System.out.println("----------------------------------");
		// Question 2
//		Khởi tạo 1 Object với mỗi constructor ở trên
//		a) Không có parameters
		Account account1 = new Account();
		System.out.println(account1.toString());

//		b) Có các parameter là id, Email, Username, FirstName,
//		LastName (với FullName = FirstName + LastName)
		Position position1 = new Position();
		Account account2 = new Account(2, "mail.com", "名", "姓", position1, LocalDate.now());
		System.out.println(account2.toString());

//		c) Có các parameter là id, Email, Username, FirstName,
//		LastName (với FullName = FirstName + LastName) và
//		Position của User, default createDate = now
		Account account3 = new Account(3, "mail.com", "名", "姓");
		System.out.println(account3.toString());

	}
}
