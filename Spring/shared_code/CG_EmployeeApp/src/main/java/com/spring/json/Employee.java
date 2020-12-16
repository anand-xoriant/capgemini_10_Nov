package com.spring.json;

public class Employee {

	private Long employeeId;
	private String name;
	private double sal;

	public Employee() {
		
	}
	
	public Employee(String name, double sal) {
		this.name = name;
		this.sal = sal;
	}

	public Employee(Long employeeId, String name, double sal) {
		this.employeeId = employeeId;
		this.name = name;
		this.sal = sal;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	public String toString() {
		return employeeId + " - " + name + " - " + sal;
	}
	
}
