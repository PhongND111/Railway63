package com.vti.entity;

public class Worker extends Staff {

	private int rank;

//	public Worker(int id, String name, int age, Gender gender, String address, int rank) {
//		super(id, name, age, gender, address);
//		this.rank = rank;
//	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Thông tin worker" + "\n" + "ID: " + super.getId() + "\n" + "Name: " + super.getName() + "\n"
				+ "Gender: " + super.getGender() + "\n" + "Address: " + super.getAddress() + "\n" + "Rank: " + rank
				+ "\n";
	}

}
