package com.low_level_design_pattern.abstract_pattern;

public class JavaDevFactory extends EmployeeAbstractFactory {

	@Override
	public Employee createEmployee() {
		return new JavaDeveloper();
	}

}
