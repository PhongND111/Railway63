package com.vti.entity;

public class Department {
	public int id;
	public String name;

// hàm tạo không tham số
	public Department() {

	}

//hàm tạo có tham số
	public Department(int id) {
		this.id = id;
	}

	// hàm tạo có 2 tham số
	public Department(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String printDept() {
		return "ID la " + this.id + ", ten la " + this.name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
