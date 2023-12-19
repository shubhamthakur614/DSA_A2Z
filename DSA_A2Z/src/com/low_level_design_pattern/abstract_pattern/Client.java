package com.low_level_design_pattern.abstract_pattern;

public class Client {
	public static void main(String[] args) {
		Employee employee = EmployeeFactory.getEmployee(new JavaDevFactory());
		employee.name();
	}

}
