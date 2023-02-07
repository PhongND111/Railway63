package com.vti.entity;

public class Mentor extends Staff {
	private int yearsOfExperience;

	public Mentor(int id, String name, String gender, int yearsOfExperience) {
		super(id, name, gender);
		this.yearsOfExperience = yearsOfExperience;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	// Hàm in thông tin của mentor: ud, name, gender, experience
	public void printInfoMentor() {
		System.out.println("Thông tin của mentor");
		System.out.println("ID: " + super.getId());
		System.out.println("Name: " + super.getName());
		System.out.println("Gender: " + super.getGender());
		System.out.println("Kinh nghiệm: " + this.getYearsOfExperience());
	}
}
