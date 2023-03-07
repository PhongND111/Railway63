package com.vti.entity;

public class Student {
	private int id;
	private String nameString;

	public Student(int id, String nameString) {
		super();
		this.id = id;
		this.nameString = nameString;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", nameString=" + nameString + "]";
	}

}
