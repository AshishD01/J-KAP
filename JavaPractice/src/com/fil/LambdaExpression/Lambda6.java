package com.fil.LambdaExpression;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private LocalDate hireDate;
	private String designation;
	private double salary;
	private int managerId;
	private Department department;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Employee(int employeeId, String firstName, String lastName, String email, String phoneNumber,
			LocalDate hireDate, String designation, double salary, int managerId, Department department) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.hireDate = hireDate;
		this.designation = designation;
		this.salary = salary;
		this.managerId = managerId;
		this.department = department;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", phoneNumber=" + phoneNumber + ", hireDate=" + hireDate + ", designation=" + designation
				+ ", salary=" + salary + ", managerId=" + managerId + ", department=" + department + "]";
	}
}

class Department {
	private int departmentId;
	private String departmentName;
	private int managerId;

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public Department(int departmentId, String departmentName, int managerId) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.managerId = managerId;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", managerId="
				+ managerId + "]";
	}
}

class EmployeeRepository {

	public static List<Employee> getEmployees() {
		List<Employee> Employees = new ArrayList<>();

		Department department1 = new Department(1, "Gautam", 1);
		Department department2 = new Department(2, "Nancy", 2);
		Department department3 = new Department(3, "Pratx", 3);

		Employees.add(new Employee(1, "Utkarsh", "rana", "ut@gmail.com", "1245784514", LocalDate.of(2020, 5, 15),
				"Master", 120000.0, 1, department1));
		Employees.add(new Employee(2, "Jatin", "rana", "ut@gmail.com", "1245784514", LocalDate.of(2020, 5, 15), "Tech",
				170000.0, 2, department2));
		Employees.add(new Employee(1, "inshita", "Bamba", "ut@gmail.com", "1245784514", LocalDate.of(2020, 5, 15), "Hr",
				160000.0, 3, department3));
		Employees.add(new Employee(1, "parth", "sharma", "ut@gmail.com", "1245784514", LocalDate.of(2020, 5, 15), "Hr",
				150000.0, 1, department1));
		Employees.add(new Employee(1, "prince", "verma", "ut@gmail.com", "1245784514", LocalDate.of(2020, 5, 15), "ISS",
				180000.0, 2, department2));
		return Employees;
	}
}

public class Lambda6 {

	public static double calculateTotalSalary(List<Employee> employees) { // 6th done
		double totalSalary = 0.0;
		for (Employee employee : employees) {
			totalSalary += employee.getSalary();
		}
		return totalSalary;
	}

	public static void listDepartmentNamesAndEmployeeCounts(List<Employee> employees) { // 7th done
		Map<String, Long> departmentEmployeeCountMap = employees.stream().collect(
				Collectors.groupingBy(employee -> employee.getDepartment().getDepartmentName(), Collectors.counting()));

		departmentEmployeeCountMap.forEach((departmentName, employeeCount) -> {
			System.out.println("Department: " + departmentName + ", Employee Count: " + employeeCount);
		});
	}

	public static Employee findSeniorMostEmployee(List<Employee> employees) {
		if (employees.isEmpty()) {
			return null; // Return null if there are no employees.
		}

		LocalDate seniorMostHireDate = LocalDate.now();
		Employee seniorMostEmployee = null;

		for (Employee employee : employees) {
			if (employee.getHireDate().isBefore(seniorMostHireDate)) {
				seniorMostHireDate = employee.getHireDate();
				seniorMostEmployee = employee;
			}
		}

		return seniorMostEmployee;
	}

	public static void main(String[] args) {
		List<Employee> employees = EmployeeRepository.getEmployees();

//		listDepartmentNamesAndEmployeeCounts(employees); 		 7th done

//6th done
//        double totalSalary = calculateTotalSalary(employees);
//        System.out.println("Total Salary of All Employees: " + totalSalary);

		Employee seniorMostEmployee = findSeniorMostEmployee(employees);

		if (seniorMostEmployee != null) {
			System.out.println("Senior Most Employee:");
			System.out.println(seniorMostEmployee);
		} else {
			System.out.println("No employees found in the organization.");
		}

	}

}
