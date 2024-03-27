package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.stack._5Balances_Bracket;

class Employee {
	int id;
	String name;
	int age;
	String gender;
	double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, int age, String gender, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

public class Test {

	public static void main(String[] args) {
		List<Employee> l = new ArrayList<>();

		l.add(new Employee(1, "Shubham", 27, "Male", 26442));

		l.add(new Employee(2, "Akash", 25, "Male", 29442));

		l.add(new Employee(3, "Sneha", 21, "Female", 21442));

		l.add(new Employee(4, "Abhishek", 29, "Male", 46442));
		Map<String, Double> collect = l.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));

		System.out.println(collect);

		List<Employee> collect2 = l.stream().sorted(Comparator.comparing(Employee::getAge).reversed())
				.collect(Collectors.toList());

		List<Integer> list = Arrays.asList(1, 5, 2, 6, 9);
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		Integer max = list.stream().max(Comparator.naturalOrder()).get();
		System.out.println(sum);
		System.out.println(max);

		List<String> list1 = Arrays.asList("key1=value1", "key2=value2", "key3=value3");
		Map<String, String> collect3 = list1.stream().map(x -> x.split("="))
				.collect(Collectors.toMap(x -> x[0], y -> y[1]));
		System.out.println(collect3);

	}

}
