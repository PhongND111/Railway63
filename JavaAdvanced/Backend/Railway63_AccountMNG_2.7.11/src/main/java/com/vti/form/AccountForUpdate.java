package com.vti.form;

import com.vti.entity.Department;
import com.vti.entity.Position;

public class AccountForUpdate {
	private String fullname;
	private short departmentId;
	private short positionId;
	public AccountForUpdate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public short getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(short departmentId) {
		this.departmentId = departmentId;
	}
	public short getPositionId() {
		return positionId;
	}
	public void setPositionId(short positionId) {
		this.positionId = positionId;
	}

	
}
