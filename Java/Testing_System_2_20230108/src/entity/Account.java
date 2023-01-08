package entity;

import java.time.LocalDate;

public class Account {
	public int id;
	public String email;
	public String username;
	public String fullName;
	public Department department;
	public Position position;
	public LocalDate createDate;
	public Group[] groups;

	@Override
	public String toString() {
		return "Email: " + email + ", Full name: " + fullName + ", Department: " + department.name;
	}
}
