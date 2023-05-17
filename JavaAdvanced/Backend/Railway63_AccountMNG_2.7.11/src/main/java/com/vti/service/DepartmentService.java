package com.vti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vti.entity.Department;
import com.vti.form.DepartmentFormForCreating;
import com.vti.repository.IDepartmentRepository;

@Service // để tool biết đây là tầng Serivce
public class DepartmentService implements IDepartmentService {

	@Autowired
	private IDepartmentRepository departmentRepository;
	
	@Override
	public List<Department> getAllDepartments() {

		List<Department> listDepartments = departmentRepository.findAll();
		return listDepartments;
	}

	public Department getDepartmentByID(short id) {
		Department department = departmentRepository.findById(id).get();
		return department;
	}

	@Override
	public void createDepartment(DepartmentFormForCreating formForCreating) {
Department department = new Department();
department.setName(formForCreating.getName());
departmentRepository.save(department);
	}

	@Override
	public void deleteAccountByID(short id) {
		departmentRepository.deleteById(id);
		
	}

}
