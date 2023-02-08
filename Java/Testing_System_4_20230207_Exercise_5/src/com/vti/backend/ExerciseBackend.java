package com.vti.backend;

import java.util.Scanner;

import com.vti.entity.Employee;
import com.vti.entity.Engineer;
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
		case 1:// Worker
			System.out.println("Nhập ID");
			int id = scanner1.nextInt();
			String skipString = scanner1.nextLine();
			System.out.println("Nhập name");
			String nameString = scanner1.nextLine();
			System.out.println("Nhập gender: \"Male\", \"Female\", \"NA\"");
			Gender gender = Gender.valueOf(scanner1.nextLine());
			System.out.println("Nhập address");
			String addressString = scanner1.nextLine();
			System.out.println("Nhập rank (số dương)");
			int rankInt = scanner1.nextInt();

			Worker worker1 = new Worker();
			worker1.setId(id);
			worker1.setName(nameString);
			worker1.setGender(gender);
			worker1.setAddress(addressString);
			worker1.setRank(rankInt);

			System.out.println("Thông tin công nhân vừa tạo");
			System.out.println("ID: " + worker1.getId());
			System.out.println("Name: " + worker1.getName());
			System.out.println("Gender: " + worker1.getGender());
			System.out.println("Address: " + worker1.getAddress());
			System.out.println("Rank: " + worker1.getRank());
			System.out.println("\n");
			break;

		case 2:// Engineer
			System.out.println("Nhập ID");
			int idEngineer = scanner1.nextInt();
			String skipEngineer = scanner1.nextLine();
			System.out.println("Nhập name");
			String nameEngineer = scanner1.nextLine();
			System.out.println("Nhập gender: \"Male\", \"Female\", \"NA\"");
			Gender genderEngineer = Gender.valueOf(scanner1.nextLine());
			System.out.println("Nhập address");
			String addressEngineer = scanner1.nextLine();
			System.out.println("Nhập ngành đào tạo");
			String specializedEngineer = scanner1.nextLine();

			Engineer engineer1 = new Engineer();
			engineer1.setId(idEngineer);
			engineer1.setName(nameEngineer);
			engineer1.setGender(genderEngineer);
			engineer1.setAddress(addressEngineer);
			engineer1.setSpecialized(specializedEngineer);

			System.out.println("Thông tin kỹ sư vừa tạo");
			System.out.println("ID: " + engineer1.getId());
			System.out.println("Name: " + engineer1.getName());
			System.out.println("Gender: " + engineer1.getGender());
			System.out.println("Address: " + engineer1.getAddress());
			System.out.println("Ngành đào tạo: " + engineer1.getSpecialized());
			System.out.println("\n");
			break;

		case 3:// Employee
			System.out.println("Nhập ID");
			int idEmployee = scanner1.nextInt();
			String skipEmployee = scanner1.nextLine();
			System.out.println("Nhập name");
			String nameEmployee = scanner1.nextLine();
			System.out.println("Nhập gender: \"Male\", \"Female\", \"NA\"");
			Gender genderEmployee = Gender.valueOf(scanner1.nextLine());
			System.out.println("Nhập address");
			String addressEmployee = scanner1.nextLine();
			System.out.println("Nhập nghề nghiệp");
			String jobEmployee = scanner1.nextLine();

			Employee employee1 = new Employee();
			employee1.setId(idEmployee);
			employee1.setName(nameEmployee);
			employee1.setGender(genderEmployee);
			employee1.setAddress(addressEmployee);
			employee1.setJob(jobEmployee);

			System.out.println("Thông tin nhân viên vừa tạo");
			System.out.println("ID: " + employee1.getId());
			System.out.println("Name: " + employee1.getName());
			System.out.println("Gender: " + employee1.getGender());
			System.out.println("Address: " + employee1.getAddress());
			System.out.println("Ngành đào tạo: " + employee1.getJob());
			System.out.println("\n");
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
