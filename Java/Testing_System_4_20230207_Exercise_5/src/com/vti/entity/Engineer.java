package com.vti.entity;

public class Engineer extends Staff {

	private String specialized;

//	public Engineer(int id, String name, int age, Gender gender, String address, String specialized) {
//		super(id, name, age, gender, address);
//		this.specialized = specialized;
//	}

	public String getSpecialized() {
		return specialized;
	}

	public void setSpecialized(String specialized) {
		this.specialized = specialized;
	}

	public Engineer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
