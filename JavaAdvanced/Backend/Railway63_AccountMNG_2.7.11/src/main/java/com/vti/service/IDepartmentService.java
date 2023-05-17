package com.vti.service;

import java.util.List;

import com.vti.entity.Department;
import com.vti.form.DepartmentFormForCreating;

public interface IDepartmentService {

	public List<Department> getAllDepartments();

	public Department getDepartmentByID(short id);

	public void createDepartment(DepartmentFormForCreating formForCreating);

	public void deleteAccountByID(short id);

}
