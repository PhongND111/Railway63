package com.vti.backend;

import java.util.Scanner;

import com.vti.entity.Gender;
import com.vti.entity.Worker;

public class ExerciseBackend {
// addStaff()
	public void addStaff() {
		System.out.println("1. Thêm mới cán bộ");
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Chọn loại cán bộ: 1 = Worker, 2 = Engineer, 3 = Employee");
		int a = scanner1.nextInt();
		switch (a) {
		case 1:
			System.out.println("Nhập ID");
			int id = scanner1.nextInt();
			String skipString = scanner1.nextLine();
			System.out.println("Nhập name");
			String nameString = scanner1.nextLine();
			System.out.println("Nhập gender: \"Male\", \"Female\", \"NA\"");
			Gender gender = Gender.valueOf(scanner1.nextLine());
			System.out.println("Nhập address");
			String addressString = scanner1.nextLine();
			System.out.println("Nhập rank");
			int rankInt = scanner1.nextInt();
//--------------------------------------------------
			Worker worker1 = new Worker();
			worker1.setId(id);
			worker1.setName(nameString);
			worker1.setGender(gender);
			worker1.setAddress(addressString);
			worker1.setRank(rankInt);
// --------------------------------------------------
			System.out.println("Thông tin nhân viên vừa tạo");
			System.out.println("ID: " + worker1.getId());
			System.out.println("Name: " + worker1.getName());
			System.out.println("Gender: " + worker1.getGender());
			System.out.println("Address: " + worker1.getAddress());
			System.out.println("Rank: " + worker1.getRank());
			break;
		case 2:

			break;
		case 3:

			break;

		default:
			System.out.println("Vui lòng chọn 1, 2 hoặc 3.");
			System.out.println("\n");
			break;
		}
	};

//searchByName
	public void searchByName() {
		System.out.println("2. Tìm kiếm theo họ tên");

	};

//printListStaff
	public void printListStaff() {
		System.out.println("3. Hiển thị thông tin về danh sách các cán bộ");

	};

// deleteByName
	public void deleteByName() {
		System.out.println("4. Nhập vào tên của cán bộ và delete cán bộ đó");

	};

}
