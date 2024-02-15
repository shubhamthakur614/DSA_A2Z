package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q3 {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "shubham", "IT", 27400);
		Employee e2 = new Employee(5, "Sneha", "HR", 127400);
		Employee e3 = new Employee(3, "Amruta", "ITC", 47400);
		Employee e4 = new Employee(2, "Rakesh", "IT", 21400);
		Employee e5 = new Employee(4, "Prakash", "HR", 3500);
		Employee e6 = new Employee(7, "shubham", "CN", 29400);

		List<Employee> elist = Arrays.asList(e1, e2, e3, e4, e5, e6);
//		Comparator<Employee> som = ((o1, o2) -> {
//
//			int sortedByName = o1.getName().compareTo(o2.getName());
//
//			if (sortedByName != 0) {
//				return sortedByName;
//			} else {
//				return Double.compare(o2.getSalary(), o1.getSalary());
//			}
//		});
//		System.out.println(elist);
//		Collections.sort(elist, som);
//		System.out.println(elist);

		/*
		 * Another way of using comparator in java 8 to compare employee by there
		 * department if it match take emp first who's salary is more
		 * 
		   elist.sort(Comparator.comparing(Employee::getDepartment)
				.thenComparing(Comparator.comparingDouble(Employee::getSalary).reversed()));
				
				elist.forEach(x -> {
			System.out.println(x.getId() + " " + x.getName() + " " + x.getDepartment() + " " + x.getSalary());
		});
		 */
		
		Stream<Employee> sorted = elist.stream().sorted(Comparator.comparing(Employee::getName)
				.thenComparing(Comparator.comparing(Employee::getSalary).reversed()));
		sorted.forEach(emp -> {
			System.out.println(emp);
		});

		// employee from every department
//		Map<String, Long> collect = elist.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
//		System.out.println(collect);
		Entry<String, Long> entry = elist.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())).entrySet().stream()
				.max(Map.Entry.comparingByValue()).get();
		System.out.println(entry);
		Map<String, Long> collect = elist.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(collect);

	}

}
