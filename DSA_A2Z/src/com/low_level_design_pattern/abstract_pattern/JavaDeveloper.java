package com.low_level_design_pattern.abstract_pattern;

public class JavaDeveloper implements Employee {

	@Override
	public int salary() {

		return 65000;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		System.out.println("I am JAVA Developer");
		return "Java Developer";
	}

}
