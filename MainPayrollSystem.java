package com.sarin.employee_payroll_system;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainPayrollSystem {
	public static void main(String[] args) {

		inputDetails();

	}

	public static void inputDetails() {
		Scanner sc = new Scanner(System.in);
		PayrollSystem payRollSystem = new PayrollSystem();
		try (sc) {

			System.out.print("Enter Employee Name  :");
			String epmloyeeName = sc.nextLine();
			System.out.print("Enter Employee Id    :");
			int employeeId = sc.nextInt();
			System.out.print("Enter Monthly Salary :");
			double monthlySalary = sc.nextDouble();
			sc.nextLine();
			FulltimeEmployee employeeF1 = new FulltimeEmployee(epmloyeeName, employeeId, monthlySalary);

			payRollSystem.addEmployee(employeeF1);
			System.out.println("\nFulltime Employee Details.\n");
			payRollSystem.displayemployee();

			System.out.println("");
			System.out.println("Do you Want to Hire Partime Employee [Yes/No] :");
			String ptime = sc.nextLine();

			if (ptime.equalsIgnoreCase("yes")) {

				// Partime Employee

				System.out.println();

				System.out.println("Partime Employee Details.\n");
				System.out.print("Enter Employee Name :");
				String tEpmloyeeName = sc.nextLine();
				// epmloyeeName = sc.nextLine();
				System.out.print("Enter Employee Id   :");
				int tEmployeeId = sc.nextInt();
				System.out.print("Enter Worked Hours  :");
				int workedHourse = sc.nextInt();
				System.out.print("Enter Hourly Rate   :");
				int hourlyRate = sc.nextInt();

				PartimeEmployee employeeP1 = new PartimeEmployee(tEpmloyeeName, tEmployeeId, workedHourse, hourlyRate);

				payRollSystem.addEmployee(employeeP1);

				System.out.println("\nPartime Employee Details.\n");
				payRollSystem.displayemployee();

				System.out.println("\nDo you Want to Remove Employee [Yes/No] :");
				String remove = sc.nextLine();
				remove = sc.nextLine();
				if (remove.equalsIgnoreCase("Yes"))

					System.out.print("\nEnter Emplyee Id To Remove :");
				int rId = sc.nextInt();
				payRollSystem.removeEmployee(rId);
				System.out.println();
				System.out.println(rId + " Employee Removed Succefully.");
				System.out.println();
				payRollSystem.displayemployee();

			} else {
				System.out.println("Thank you.");
			}
		}

		catch (InputMismatchException e) {
			System.err.println("Please Enter Valid Input.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
