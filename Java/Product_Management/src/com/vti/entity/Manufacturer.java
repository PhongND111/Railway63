package com.vti.entity;

public class Manufacturer {
	private int id;
	private String name;

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

	public Manufacturer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Thông tin nhà sản xuất:" + "\n" + "ID: " + id + "\n" + "Tên nhà sản xuất: " + name;
	}

}
