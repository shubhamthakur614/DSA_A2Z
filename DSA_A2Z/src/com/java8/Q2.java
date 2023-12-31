package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q2 {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "shubham", "IT", 27400);
		Employee e2 = new Employee(1, "Sneha", "HR", 127400);
		Employee e3 = new Employee(1, "Amruta", "ITC", 47400);
		Employee e4 = new Employee(1, "Rakesh", "IT", 21400);
		Employee e5 = new Employee(1, "Prakash", "HR", 3500);
		List<Employee> elist = Arrays.asList(e1, e2, e3, e4, e5);

		// find the employee whose salary mAaximum in its department
//		elist.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)))));
		elist.stream()
        .collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));

//		Map<String,Object<Employee>>collection=elist.stream().Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary));

	}
}
