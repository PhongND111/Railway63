package com.vti.frontend;

import java.time.LocalDate;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;

public class Program {
	public static void main(String[] args) {

//		Tạo department instance
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Sale";

		System.out.println("Thong tin department");
		System.out.println("ID: " + department1.id);
		System.out.println("Name: " + department1.name);
		System.out.println("\n");

//		Tạo Position instance
		Position position1 = new Position();
		position1.id = 1;
		position1.name = "Dev";

		System.out.println("Thong tin vi tri");
		System.out.println("ID: " + position1.id);
		System.out.println("Name: " + position1.name);
		System.out.println("\n");

//		Tạo Account instance
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "abc@gmail.com";
		account1.fullName = "Nguyen Van A";
		account1.depID = 1;
		account1.posID = 1;
		account1.createDate = LocalDate.now();

		System.out.println("Thong tin account");
		System.out.println("ID: " + account1.id);
		System.out.println("Email: " + account1.email);
		System.out.println("Name: " + account1.fullName);
		System.out.println("Department: " + account1.depID);
		System.out.println("Position: " + account1.depID);
		System.out.println("Ngay tao: " + account1.createDate);
		System.out.println("\n");

//		Tạo Group instance
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Nhom 1";
		group1.creatorId = 1;
		group1.createDate = LocalDate.now();

		System.out.println("Thong tin group");
		System.out.println("ID: " + group1.id);
		System.out.println("Ten nhom: " + group1.name);
		System.out.println("ID nguoi tao: " + group1.creatorId);
		System.out.println("Ngay tao: " + group1.createDate);
	}
}
