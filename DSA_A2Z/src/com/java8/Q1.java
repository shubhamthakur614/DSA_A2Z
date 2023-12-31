package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//find the second highest salary of employee
class Employee {
	private int id;
	private String name;
	private String department;
	private double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String department, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}

}

public class Q1 {
	public static void main(String[] args) {
		List<Integer> alist = Arrays.asList(1, 3, 51, 13, 534, 534);

		Employee e1 = new Employee(1, "shubham", "IT", 27400);
		Employee e2 = new Employee(1, "Sneha", "HR", 127400);
		Employee e3 = new Employee(1, "Amruta", "ITC", 47400);
		Employee e4 = new Employee(1, "Rakesh", "IT", 21400);
		Employee e5 = new Employee(1, "Prakash", "HR", 3500);
		List<Employee> elist = Arrays.asList(e1, e2, e3, e4, e5);

//find sec highest no from array
		Integer secHighest = alist.stream().sorted((x, y) -> y - x).distinct().skip(1).findFirst().get();
		System.out.println("Second Highest no from Array: " + secHighest);

		// find sec g=highest salary from employee
		Double secHighestFromEmployee = elist.stream().map(Employee::getSalary).sorted(Collections.reverseOrder())
				.distinct().skip(1).findFirst().get();
		System.out.println(secHighestFromEmployee);
		// another solution using comparingDouble
		Employee employee = elist.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).distinct()
				.skip(1).findFirst().get();

		System.out.println(employee);

	}
}
