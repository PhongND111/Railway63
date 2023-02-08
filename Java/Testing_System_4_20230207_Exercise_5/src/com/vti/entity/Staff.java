package com.vti.entity;

public class Staff {
	private int id;
	private String name;
	private int age;
	private Gender gender;
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public Staff(int id, String name, int age, Gender gender, String address) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.age = age;
//		this.gender = gender;
//		this.address = address;
//	}

}
