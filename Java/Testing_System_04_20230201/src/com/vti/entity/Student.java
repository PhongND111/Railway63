package com.vti.entity;

public class Student {
	public int id;
	public String name;

	public void study() {
		System.out.println("Studying very hard");
	}

	public static void main(String[] args) {
		Student student1 = new Student();

		student1.study();
	}
}
