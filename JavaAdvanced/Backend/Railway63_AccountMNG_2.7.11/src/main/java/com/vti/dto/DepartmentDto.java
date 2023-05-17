package com.vti.dto;

public class DepartmentDto {
private String name;
private int id;


public DepartmentDto(String name) {
	super();
	this.name = name;
}

public DepartmentDto() {
	super();
	// TODO Auto-generated constructor stub
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public DepartmentDto(int id) {
	super();
	this.id = id;
}

}
