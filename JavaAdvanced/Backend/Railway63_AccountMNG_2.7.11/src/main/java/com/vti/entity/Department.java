package com.vti.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
//import jakarta.persistence.Table;


//@entity dùng để thông báo cho java biết class Department là 1 entity (POJO)
//@Table dùng để thông báo java class Department mapping với bảng department
// name="department": tên bảng
// catalog = "TestingSystem": tên database
@Entity
@Table(name = "department", catalog = "TestingSystem")
public class Department implements Serializable {
	@Column(name = "DepartmentID")
	@Id // thông báo trường id ở dưới là id ở database
	@GeneratedValue(strategy = GenerationType.IDENTITY) // do id ở DB là auto increment nên ở đây note như này để thể
														// hiện là giá trị tự động tăng
	private short id;
	@Column(name = "DepartmentName", nullable = false, unique = true)
// Ở DB là NOT NULL => nullable = false
// Ở DB là UNIQUE KEY => unique = true
// ※ Ở DB có thuộc tính gì thì ở java sẽ thêm các thuộc tính tương ứng
	private String name;

//	@OneToMany(mappedBy = "department") // một phòng ban có nhiều account
	// mapping với instance department của file Account.jaav
//	List<Account> accounts;

// hàm tạo không tham số
	public Department() {

// hàm getter setter
	}

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}

}
