package com.vti.frontend;

import com.vti.entity.Account;
import com.vti.entity.Department;

public class Demo_20230131 {
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

		Department department1 = new Department();
		Department department2 = new Department(1);

		System.out.println(department1.printDept());
		System.out.println(department1.toString());

		Account account1 = new Account(1, "abc@gmail.com", "FistName", "LastName");
		System.out.println(account1.toString());
	}
}
