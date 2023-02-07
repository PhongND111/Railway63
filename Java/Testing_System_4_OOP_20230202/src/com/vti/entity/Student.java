package com.vti.entity;

public class Student extends Staff {
	private String job;
	private String hometown;
	private int hocluc;

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public int getHocluc() {
		return hocluc;
	}

	public void setHocluc(int hocluc) {
		this.hocluc = hocluc;
	}

	public Student(int id, String name, String gender, String hometown) {
		super(id, name, gender); // cách lấy property từ class cha.
		// Chính xác là lấy từ constructor của class cha.
		this.hometown = hometown;
		this.hocluc = 0;
	}

//	@Override
//	public String toString() {
//		return "ID: " + this.getId() + "\n" + "Name: " + this.getName() + "\n" + "Hometown: " + this.getHometown()
//				+ "\n" + "Hoc luc: " + this.getHocluc();
//	}
}
