package com.sarin.employee_payroll_system;

public class PartimeEmployee extends Employee {
	private int hourseWorked;
	private double hourlyRate;

	public PartimeEmployee( String employeeName, int employeeId, int hourseWorked, double hourlyRate) {
		super(employeeName, employeeId);
		this.hourseWorked = hourseWorked;
		this.hourlyRate = hourlyRate;
	}

	@Override
	public double calculateSalary() {

		return hourseWorked * hourlyRate;
	}

}
