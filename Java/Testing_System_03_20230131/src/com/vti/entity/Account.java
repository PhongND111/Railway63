package com.vti.entity;

public class Account {
	public int id;
	public String email;
	public String fullname;

	public Account(int id, String email, String firstName, String lastName) {
		this.id = id;
		this.email = email;
		this.fullname = firstName + lastName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID: " + id + ", Email: " + email + ", Fullname: " + fullname;
	}
}
