package com.low_level_design_pattern.factory;

/*
 * In factory design pattern if we have parent class (interface/abstract class)
 * we have different child class which provide the implementation of parent class and
 * there methods.
 * 
 * so factor method will help you to create the object of such child classes based on i/p
 * without directly it exposing into the client class which is not a good practice.
 * 
 * so for that we create factory class where we provide the object creation of child based on
 * some i/p from client and return client an object of child with letting him know the actual 
 * code.
 * 
 * 
 * 
 */
public class Client {
	public static void main(String[] args) {

		// if client want to create the object for java Developer then he just pass
		// argument as java without knowing the actual logic

		Employee employee = DevelolperFactory.getEmployee("JAVa");
		int javaSalary = employee.salary();
		System.out.println(javaSalary);

		Employee employee1 = DevelolperFactory.getEmployee("Android");
		int androidSalary = employee1.salary();
		System.out.println(androidSalary);

	}

}
