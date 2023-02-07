package com.vti.frontend;

import java.util.Scanner;

import com.vti.backend.ExerciseBackend;

public class Program {
	public static void main(String[] args) {
		Scanner scannerEx1 = new Scanner(System.in);
		ExerciseBackend exerciseBackend1 = new ExerciseBackend();
		while (true) {
			System.out.println("+------------------------Menu------------------------+");
			System.out.printf("|%-52s|%n", "1. Thêm mới cán bộ");// 52 = 54 - số ký tự ||
			System.out.printf("|%-52s|%n", "2. Tìm kiếm theo họ tên");
			System.out.printf("|%-52s|%n", "3. Hiển thị thông tin về danh sách các cán bộ");
			System.out.printf("|%-52s|%n", "4. Nhập vào tên của cán bộ và delete cán bộ đó");
			System.out.printf("|%-52s|%n", "5. Thoát khỏi chương trình");

			int a = scannerEx1.nextInt();
			switch (a) {
			case 1:
				exerciseBackend1.addStaff();
				break;
			case 2:
				exerciseBackend1.searchByName();
				break;
			case 3:
				exerciseBackend1.printListStaff();
				break;
			case 4:
				exerciseBackend1.deleteByName();
				break;
			case 5:
				System.out.println("\n");
				System.out.println("おおきに");
				return;
			}

		}
	}
}
