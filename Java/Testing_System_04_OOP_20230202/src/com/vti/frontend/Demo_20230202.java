package com.vti.frontend;

import com.vti.entity.Account;
import com.vti.entity.Mentor;

public class Demo_20230202 {
	public static void main(String[] args) {
		Account account1 = new Account();
		account1.setId(1);
		account1.setEmail("@gmailcom");
		account1.setFullname("Karl Lagerfeld");
		account1.setUsername("karlito");

		System.out.println("Thong tin account" + account1.getId());
		System.out.println("ID: " + account1.getId());
		System.out.println("Email: " + account1.getEmail());
		System.out.println("Fullname: " + account1.getFullname());
		System.out.println("Username: " + account1.getUsername());

		System.out.println("\n");
		System.out.println("----------------Create mentor--------------");
		Mentor mentor1 = new Mentor(10, "Karl", "M", 10);

		mentor1.printInfoMentor();
//		System.out.println("Thong tin mentor");
//		System.out.println("ID: " + mentor1.getId());
//		System.out.println("Name: " + mentor1.getName());
//		System.out.println("Gender: " + mentor1.getGender());
//		System.out.println("Experience: " + mentor1.getYearsOfExperience() + " year(s)");

//		System.out.println("\n");
//		System.out.println("----------------Create student--------------");
//		Student student1 = new Student();
//		student1.setId(1);
//		student1.setName("Yves");
//		student1.setGender("M");
//		student1.setJob("Couturier");
//
//		System.out.println("Thong tin student");
//		System.out.println("ID: " + student1.getId());
//		System.out.println("Name: " + student1.getName());
//		System.out.println("Gender: " + student1.getGender());
//		System.out.println("Job: " + student1.getJob());

//		Student student2 = new Student("Hanoi");
//		student2.setName("Nguyen Van A");
//		System.out.println(student2.toString());

	}
}
