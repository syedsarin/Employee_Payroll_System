package com.sarin.employee_payroll_system;

import java.util.ArrayList;

public class PayrollSystem {

	private ArrayList<Employee> employeeList;

	public PayrollSystem() {
		employeeList = new ArrayList<>();
	}

	public void addEmployee(Employee employee) {
		employeeList.add(employee);
	}

	public void removeEmployee(int empId) {
		Employee employeeToRemove = null;
		for (Employee employee : employeeList) {
			if (employee.geteEmployeeId() == empId) {
				employeeToRemove = employee;
				break;
			}
		}
		if (employeeToRemove != null) {
			employeeList.remove(employeeToRemove);
		} else {
			System.out.println("Employee Not Exits.");
		}
	}
	public void displayemployee()
	{
		for(Employee employee : employeeList)
		{
			System.out.println(employee);
		}
	}
}
