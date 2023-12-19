package com.low_level_design_pattern.abstract_pattern;

public class AndroidDeveloper implements Employee {

	@Override
	public int salary() {
		// TODO Auto-generated method stub
		return 25000;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		System.out.println("I am Android Developer");
		return "Android Developer";
	}

}
