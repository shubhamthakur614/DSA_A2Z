package com.low_level_design_pattern.factory;

public class JavaDeveloper implements Employee {

	@Override
	public int salary() {
		System.out.println("Java Developer is Created...");
		return 65000;
	}

	public static void IdeUsed() {
		System.out.println("Eclipse and IntelliJ IDEA is Used...");
	}

}
