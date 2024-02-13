package com.sarin.employee_payroll_system;

public abstract class Employee {
	private String employeeName;
	private int employeeId;

	// Parametrized constructor To Intialized the Instance Variable
	public Employee(String employeeName, int employeeId) {
		this.employeeName = employeeName;
		this.employeeId = employeeId;
	}

	// Getter To Read The Private Data
	public String getEmplyeeName() {
		return employeeName;
	}

	// Getter To Read The Private Data
	public int geteEmployeeId() {
		return employeeId;
	}

	public abstract double calculateSalary();

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ",Salary()="
				+ calculateSalary() + "]";
	}

}
