package com.vti.entity;

public class Employee extends Staff {
	private String job;

//	public Employee(int id, String name, int age, Gender gender, String address, String job) {
//		super(id, name, age, gender, address);
//		this.job = job;
//	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Thông tin employee" + "\n" + "ID: " + super.getId() + "\n" + "Name: " + super.getName() + "\n"
				+ "Gender: " + super.getGender() + "\n" + "Address: " + super.getAddress() + "\n" + "Job: " + job
				+ "\n";
	}

}
