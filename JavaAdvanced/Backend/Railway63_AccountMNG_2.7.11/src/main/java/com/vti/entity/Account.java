package com.vti.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;
//import jakarta.persistence.Temporal;
//import jakarta.persistence.TemporalType;

@javax.persistence.Entity
@javax.persistence.Table(name = "Account", catalog = "TestingSystem")
public class Account implements Serializable {
	@Column(name = "AccountID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // do id ở DB là auto increment nên ở đây note như này để thể
	private short id;

	@Column(name = "Email", length = 50, nullable = false, unique = true)
	private String email;

	@Column(name = "Username", length = 50, nullable = false, unique = true)
	private String username;

	@Column(name = "FullName", length = 50, nullable = false)
	private String fullname;

	@ManyToOne // nhiều account trong 1 phòng ban
	@JoinColumn(name = "DepartmentID", nullable = false)
	private Department department;

	@ManyToOne
	@JoinColumn(name = "PositionID", nullable = false)
	private Position position;
	
	@Column(name = "password", length = 800)
	private String password;


	@Column(name = "CreateDate")
	@Temporal(TemporalType.TIMESTAMP) // ở DB là DATETIME nên ở đây chuyển thành TIMESTAMP
	@CreationTimestamp // thay cho DEFAULT NOW ở DB
	private Date createDate;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", username=" + username + ", fullname=" + fullname
				+ ", department=" + department + ", position=" + position + ", createDate=" + createDate + "]" + "\n";
	}

}
