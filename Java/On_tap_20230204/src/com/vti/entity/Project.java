package com.vti.entity;

public class Project {
	private int projectId;
	private int teamSize;
	private int idManager;
	private Employee[] idEmployees;

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public int getIdManager() {
		return idManager;
	}

	public void setIdManager(int idManager) {
		this.idManager = idManager;
	}

	public Employee[] getIdEmployees() {
		return idEmployees;
	}

	public void setIdEmployees(Employee[] idEmployees) {
		this.idEmployees = idEmployees;
	}

	public Project(int projectId, int teamSize, int idManager, Employee[] idEmployees) {
		super();
		this.projectId = projectId;
		this.teamSize = teamSize;
		this.idManager = idManager;
		this.idEmployees = idEmployees;
	}

}
