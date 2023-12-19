package com.low_level_design_pattern.abstract_pattern;

public class EmployeeFactory {

	public static Employee getEmployee(EmployeeAbstractFactory factory) {
		return factory.createEmployee();

	}

}
