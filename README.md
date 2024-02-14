# Employee_Payroll_System

The Payroll System is a Java application designed to manage employee information and calculate salaries for full-time and part-time employees.

Table of Contents

Classes
  - Employee
  - FulltimeEmployee
  - PartimeEmployee
  - PayrollSystem
Usage

Classes

1) Employee:

Description: Abstract class representing an employee with basic attributes like name and ID.

Attributes:
- employeeName: Name of the employee.
- employeeId: Unique ID of the employee.

Methods:
- getEmplyeeName(): Getter for retrieving the employee name.
- getEmployeeId(): Getter for retrieving the employee ID.
- calculateSalary(): Abstract method to calculate the salary of an employee.
- toString(): Override of the toString() method to provide a string representation of the employee.

2) FulltimeEmployee:

Description: Concrete subclass of Employee representing a full-time employee.

Attributes:
- monthlySalary: Monthly salary of the full-time employee.
Methods:
- calculateSalary(): Overrides the calculateSalary() method from the Employee class to return the monthly salary.

3) PartimeEmployee:

Description: Concrete subclass of Employee representing a part-time employee.
Attributes:
- hoursWorked: Number of hours worked by the part-time employee.
- hourlyRate: Hourly rate of the part-time employee.
Methods:
- calculateSalary(): Overrides the calculateSalary() method from the Employee class to return the salary based on hours worked and hourly rate.

4) PayrollSystem:

Description: Class responsible for managing a list of employees and performing operations like adding, removing, and displaying employees.

Attributes:
- employeeList: ArrayList to store instances of Employee.
Methods:
- addEmployee(Employee employee): Adds an employee to the list.
- removeEmployee(int empId): Removes an employee from the list based on employee ID.
- displayEmployee(): Displays details of all employees in the list.

Usage

The MainPayrollSystem class contains the main method to run the application. It prompts the user to input details of full-time employees, then optionally adds part-time employees, allows for employee removal, and displays the updated employee list.

To run the application, execute the main() method in the MainPayrollSystem class.
