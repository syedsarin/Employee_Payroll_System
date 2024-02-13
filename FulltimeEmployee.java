package com.sarin.employee_payroll_system;

public class FulltimeEmployee extends Employee {
	private double monthlySalary;

	public FulltimeEmployee(String employeeName, int employeeId, double monthlySalary ) {
		super(employeeName, employeeId);
		this.monthlySalary = monthlySalary;
	}

	@Override
	public double calculateSalary() {

		return monthlySalary;
	}

}
