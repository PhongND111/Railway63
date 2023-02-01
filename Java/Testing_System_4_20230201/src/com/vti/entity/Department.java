package com.vti.entity;

public class Department {
	public int id;
	public String name;

// hàm tạo không tham số
	public Department() {

	}

//hàm tạo có tham số
	public Department(String name) {
		this.id = 0;
		this.name = name;
	}

	// hàm tạo có 2 tham số
	public Department(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Thong tin department: ID la " + this.id + ", name la: " + this.name;
	}

//	Exercise 1 (Optional): Constructor
//	Question 1:
//	Tạo constructor cho department:
//	a) không có parameters
//	b) Có 1 parameter là nameDepartment và default id của
//	Department = 0
//	Khởi tạo 1 Object với mỗi constructor ở trên

}
