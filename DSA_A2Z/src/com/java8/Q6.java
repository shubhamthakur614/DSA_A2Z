package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q6 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Amy", "Bill", "Anna");
		// based on there first letter group them and return he count

		Map<Character, Long> collect = names.stream()
				.collect(Collectors.groupingBy(x -> x.charAt(0), Collectors.counting()));

		System.out.println(collect);
	}

}
