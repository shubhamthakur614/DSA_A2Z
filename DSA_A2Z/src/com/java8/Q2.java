package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Q2 {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "shubham", "IT", 27400);
		Employee e2 = new Employee(1, "Sneha", "HR", 127400);
		Employee e3 = new Employee(1, "Amruta", "ITC", 47400);
		Employee e4 = new Employee(1, "Rakesh", "IT", 21400);
		Employee e5 = new Employee(1, "Prakash", "HR", 3500);
		List<Employee> elist = Arrays.asList(e1, e2, e3, e4, e5);

		// find the employee whose salary maximum in its department
		Map<String, Optional<Employee>> collect = elist.stream().collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));

		Map<String, Employee> collect2 = elist.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.collectingAndThen(
						Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)), Optional::get)));
		System.out.println(collect2);

		collect2.forEach((key, value) -> {
			System.out.println(key);
			System.out.println(value.getName() + " ");
		});

	}
}
