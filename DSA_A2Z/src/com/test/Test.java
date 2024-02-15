package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
	int id;
	String name;
	String department;
	Double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String department, Double salary) {
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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
}

public class Test {
	public static void main(String[] args) {
		List<Employee> e = new ArrayList<>();
		e.add(new Employee(1, "Z", "HR", 32000.0));
		e.add(new Employee(1, "x", "SD", 14000.0));
		e.add(new Employee(1, "S", "SD", 45000.0));
		e.add(new Employee(1, "V", "HR", 34000.0));
		e.add(new Employee(1, "T", "ST", 142000.0));

		e.forEach(x -> {
			System.out.println(x.getId() + " " + x.getName() + " " + x.getDepartment() + " " + x.getSalary());
		});
		System.out.println();
		e.sort(Comparator.comparing(Employee::getDepartment).thenComparingDouble(Employee::getSalary).reversed());

		e.forEach(x -> {
			System.out.println(x.getId() + " " + x.getName() + " " + x.getDepartment() + " " + x.getSalary());
		});
	}
}
