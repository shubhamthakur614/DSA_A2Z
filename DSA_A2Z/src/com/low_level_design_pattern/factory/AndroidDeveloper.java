package com.low_level_design_pattern.factory;

public class AndroidDeveloper implements Employee {

	@Override
	public int salary() {
		System.out.println("Android Developer is Created...");
		return 45000;
	}
	public static void IdeUsed() {
		System.out.println("Android Studion and Kotline is Used...");
	}

}
