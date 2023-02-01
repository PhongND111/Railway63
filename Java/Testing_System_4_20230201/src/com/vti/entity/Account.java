package com.vti.entity;

import java.time.LocalDate;

public class Account {
	public int id;
	public String email;
	public String fullname;
	public Position position;
	public LocalDate createDate;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID: " + id + ", Email: " + email + "\n" + ", Fullname: " + fullname + ", Position: " + position + "\n"
				+ "Create date: " + createDate;
	}

//	Question 2:
//	Tạo constructor cho Account:
//	a) Không có parameters
	public Account() {
	}

//	b) Có các parameter là id, Email, Username, FirstName,
//	LastName (với FullName = FirstName + LastName)
	public Account(int id, String email, String firstName, String lastName) {
		this.id = id;
		this.email = email;
		this.fullname = firstName + lastName;
	}

//	c) Có các parameter là id, Email, Username, FirstName,
//	LastName (với FullName = FirstName + LastName) và
//	Position của User, default createDate = now
	public Account(int id, String email, String firstName, String lastName, Position position, LocalDate createDate) {
		this.id = id;
		this.email = email;
		this.fullname = firstName + lastName;
		this.position = position;
		createDate = LocalDate.now();
	}

////	d) Có các parameter là id, Email, Username, FirstName,
////	LastName (với FullName = FirstName + LastName) và
////	Position của User, createDate
//	public Account(int id, String email, String firstName, String lastName, Position position, LocalDate createDate) {
//		this.id = id;
//		this.email = email;
//		this.fullname = firstName + lastName;
//		this.position = position;
//	}

}
