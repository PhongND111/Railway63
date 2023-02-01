package com.vti.entity;

public class Position {
	public int id;
	public PositionName name;

	@Override
	public String toString() {
		return "ID: " + id + ", Name: " + name;
	}

}
