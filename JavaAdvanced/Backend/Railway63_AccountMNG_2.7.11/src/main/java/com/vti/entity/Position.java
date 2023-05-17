package com.vti.entity;

import java.io.Serializable;
import java.util.List;

//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.EnumType;
//import jakarta.persistence.Enumerated;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
//import jakarta.persistence.Table;
//
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Position", catalog = "TestingSystem")
public class Position implements Serializable {
	@Column(name = "PositionID")
	@Id // thông báo trường id ở dưới là id ở database
	@GeneratedValue(strategy = GenerationType.IDENTITY) // do id ở DB là auto increment nên ở đây note như này để thể
	private short id;

	@Column(name = "PositionName", nullable = false)
	// name = "PositionName": tên cột ở DB
	@Enumerated(EnumType.STRING)
	private PositionName name;

	@OneToMany(mappedBy = "position")
	List<Account> accounts;

	public enum PositionName {
		Dev, Test, Scrum_Master, PM
	}

	public Position() {
		super();
		// TODO Auto-generated constructor stub
	}

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public PositionName getName() {
		return name;
	}

	public void setName(PositionName name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Position [id=" + id + ", name=" + name + "]";
	}

}
