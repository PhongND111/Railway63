package com.vti.backend;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.vti.entity.Employee;
import com.vti.entity.Engineer;
import com.vti.entity.Gender;
import com.vti.entity.Staff;
import com.vti.entity.Worker;

public class ExerciseBackend {
// addStaff()
	ArrayList<Staff> staffList = new ArrayList<>(); // <Worker> = khai báo kiểu dữ liệu
	// workerList: tên mảng
	Scanner scanner1 = new Scanner(System.in);

	public void addStaff() {
		System.out.println("1. Thêm mới cán bộ");

		System.out.println("Chọn loại cán bộ: 1 = Worker, 2 = Engineer, 3 = Employee");
		int a = scanner1.nextInt();
		switch (a) {
		case 1:// Worker
			System.out.println("Nhập ID");
			int id = scanner1.nextInt();
			System.out.println("Nhập name");
			String nameString = scanner1.next();
			System.out.println("Nhập gender: 1. Male, 2. Female, 3.NA");
			int chooseGender = scanner1.nextInt();
			Gender genderInput = null;// 1. Male, 2. Female, 3.NA
			switch (chooseGender) {
			case 1:
				genderInput = Gender.Male;
				break;
			case 2:
				genderInput = Gender.Female;
				break;
			case 3:
				genderInput = Gender.NA;
				break;
			}

			System.out.println("Nhập address");
			String addressString = scanner1.next();
			System.out.println("Nhập rank (số dương)");
			int rankInt = scanner1.nextInt();

			Worker worker1 = new Worker();
			worker1.setId(id);
			worker1.setName(nameString);
			worker1.setGender(genderInput);
			worker1.setAddress(addressString);
			worker1.setRank(rankInt);

			staffList.add(worker1);// thêm worker vào mảng
			break;

		case 2:// Engineer
			System.out.println("Nhập ID");
			int idEngineer = scanner1.nextInt();
			System.out.println("Nhập name");
			String nameEngineer = scanner1.next();
			System.out.println("Nhập gender: 1. Male, 2. Female, 3.NA");
			int chooseGenderEngineer = scanner1.nextInt();
			Gender genderInputEngineer = null;// 1. Male, 2. Female, 3.NA
			switch (chooseGenderEngineer) {
			case 1:
				genderInputEngineer = Gender.Male;
				break;
			case 2:
				genderInputEngineer = Gender.Female;
				break;
			case 3:
				genderInputEngineer = Gender.NA;
				break;
			}
			System.out.println("Nhập address");
			String addressEngineer = scanner1.next();
			System.out.println("Nhập ngành đào tạo");
			String specializedEngineer = scanner1.next();

			Engineer engineer1 = new Engineer();
			engineer1.setId(idEngineer);
			engineer1.setName(nameEngineer);
			engineer1.setGender(genderInputEngineer);
			engineer1.setAddress(addressEngineer);
			engineer1.setSpecialized(specializedEngineer);

			staffList.add(engineer1);
			break;

		case 3:// Employee
			System.out.println("Nhập ID");
			int idEmployee = scanner1.nextInt();
			System.out.println("Nhập name");
			String nameEmployee = scanner1.next();
			System.out.println("Nhập gender: 1. Male, 2. Female, 3.NA");
			int chooseGenderEmployee = scanner1.nextInt();
			Gender genderInputEmployee = null;// 1. Male, 2. Female, 3.NA
			switch (chooseGenderEmployee) {
			case 1:
				genderInputEmployee = Gender.Male;
				break;
			case 2:
				genderInputEmployee = Gender.Female;
				break;
			case 3:
				genderInputEmployee = Gender.NA;
				break;
			}
			System.out.println("Nhập address");
			String addressEmployee = scanner1.next();
			System.out.println("Nhập nghề nghiệp");
			String jobEmployee = scanner1.next();

			Employee employee1 = new Employee();
			employee1.setId(idEmployee);
			employee1.setName(nameEmployee);
			employee1.setGender(genderInputEmployee);
			employee1.setAddress(addressEmployee);
			employee1.setJob(jobEmployee);

			staffList.add(employee1);
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
		System.out.println("Hãy nhập tên");
		String findNameString = scanner1.next();
		for (Staff staff : staffList) {
			if (staff.getName().equals(findNameString)) {
				System.out.println(staff.toString());
			}
		}
	};

//printListStaff
	public void printListStaff() {
		System.out.println("3. Hiển thị thông tin về danh sách các nhân viên");
		for (Staff staff : staffList) {
			System.out.println(staffList.toString());
		}
	};

//printListStaff
	public void printListStaff2() {
		System.out.println("3. Hiển thị thông tin về danh sách các nhân viên");
		Iterator<Staff> iterator = staffList.iterator();
		while (iterator.hasNext()) {
			Staff staff = iterator.next();
			System.out.println(staff.toString());

		}
	}

// deleteByName
	public void deleteByName() {
		System.out.println("4. Nhập vào tên của cán bộ và delete cán bộ đó");
		System.out.println("Nhập tên cán bộ muốn xóa");
		String nameDeleteString = scanner1.next();
		Iterator<Staff> iterator = staffList.iterator();
		while (iterator.hasNext()) {
			Staff staff = iterator.next();
			if (staff.getName().equals(nameDeleteString)) {
				iterator.remove();
			}

		}
	};

}
