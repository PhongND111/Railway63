package com.vti.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vti.dto.DepartmentDto;
import com.vti.entity.Department;
import com.vti.form.DepartmentForUpdate;
import com.vti.form.DepartmentFormForCreating;
import com.vti.service.DepartmentService;
import com.vti.service.IDepartmentService;

@RestController //
@RequestMapping(value = "api/v1/departments")
//http://localhost:8080/api/v1/departments
@CrossOrigin("*")
public class DepartmentController {

	@Autowired
	private IDepartmentService departmentService;
	
	
	//http://localhost:8080/api/v1/departments/getAllDepartments
	@GetMapping()
	public ResponseEntity<?> getAllDepartments() {
		List<Department> listDepartments = departmentService.getAllDepartments();

		for (Department department : listDepartments) {
			System.out.println(department);
		}
		
		// trả api cho frontend
		
		// chuyển đổi dữ liệu
		List<DepartmentDto> listDepartmentDtos = new ArrayList<DepartmentDto>();
		
		for (Department department : listDepartments) {
			DepartmentDto departmentDto = new DepartmentDto();
			departmentDto.setName(department.getName());
			departmentDto.setId(department.getId());
			
			listDepartmentDtos.add(departmentDto);
		}
		
		return new ResponseEntity<>(listDepartmentDtos, HttpStatus.OK);
	}
	
	// method lấy phòng ban theo id
	//http://localhost:8080/api/v1/departments/{idDepartment}
	@GetMapping(value = "/{idDepartment}")
	public ResponseEntity<?> getDepartmentsByID(@PathVariable(name = "idDepartment") short id) {	
		//truyền "idDepartment" vào id

		System.out.println(id);
		Department department = departmentService.getDepartmentByID(id);
				
		// chuyển đổi kiểu dữ liệu
		DepartmentDto departmentDto = new DepartmentDto();
		departmentDto.setName(department.getName());
		departmentDto.setId(department.getId());
		
		return new ResponseEntity<>(departmentDto, HttpStatus.OK);
	}

	// phương thức thêm mới phòng ban
	//http://localhost:8080/api/v1/departments

	@PostMapping()
	public ResponseEntity<?> createDepartment(@RequestBody DepartmentFormForCreating formForCreating){
departmentService.createDepartment(formForCreating);
		return new ResponseEntity<>("Create Success", HttpStatus.OK);
	}
	
	// phương thức cập nhật phòng ban
	//http://localhost:8080/api/v1/departments
	@PutMapping(value = "/{idDepartmentUpdate}")
	public ResponseEntity<?> updateDepartment(@PathVariable(name = "idDepartmentUpdate") Short id,
			@RequestBody DepartmentForUpdate formForUpdating){
		System.out.println("ID: " + id);
		System.out.println("form for updating: " + formForUpdating.getName());
		
		return new ResponseEntity<>(null, HttpStatus.OK);

	}
	
	// Delete department
			//http://localhost:8080/api/v1/departments/{idDepartment}
			@DeleteMapping(value = "/{idDepartment}")
			public ResponseEntity<?> deleteDepartmentByID(@PathVariable(name = "idDepartment") short id) {	
			departmentService.deleteAccountByID(id);
			return new ResponseEntity<String>("Deleted", HttpStatus.OK);
			}

}






