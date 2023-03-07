package com.vti.entity;

public class Person implements IPerson {
	private int id;
	private String nameString;

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
	public void eat() {
		System.out.println("I eat");
	}

	@Override
	public void sleep() {
		System.out.println("I sleep");

	}

	@Override
	public void play() {
		System.out.println("I play");

	}

	@Override
	public void study() {
		System.out.println("I study");

	}

}
