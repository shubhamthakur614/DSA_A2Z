package com.low_level_design_pattern.factory;

public class DevelolperFactory {

	private DevelolperFactory() {

	}

	public static Employee getEmployee(DeveloperType type) {
		switch (type) {
		case Android:
			return new AndroidDeveloper();
		case Java:
			return new JavaDeveloper();
		default:
			throw new IllegalArgumentException("No such Employee found");
		}

		// both the way we can do
//		if (empType.trim().equalsIgnoreCase("ANDROID DEVELOPER")) {
//			
//		} else if (empType.trim().equalsIgnoreCase("JAVA DEVELOPER")) {
//			return new JavaDeveloper();
//		} else {
//			return null;
//		}
	}

}
