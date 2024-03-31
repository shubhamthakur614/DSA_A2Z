package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q4 {
	public static void main(String[] args) {
		// frequency of String and char

		List<String> fruit = Arrays.asList("Mango", "Banana", "Mango", "Watermelon", "Apple", "Banana");
		String s = "Welcome, Java Fullstack Developer java";

		// String frequency
		Map<String, Long> StringFreq = fruit.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		System.out.println(StringFreq);

		// find String duplicates by grouping by function
		List<String> duplicates = fruit.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()))
				.entrySet().stream().filter(data -> data.getValue() > 1).map(data -> data.getKey())
				.collect(Collectors.toList());
		System.out.println(duplicates);

		// frequency of character in the string
		Map<Character, Long> charFreq = s.chars().mapToObj(x -> (char) x)
				.filter(z -> z.valueOf(z) != ' ' && z.valueOf(z) != ',')
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		System.out.println(charFreq);

		// from string how to find string frequency
		Map<String, Long> collect = Arrays.stream(s.split(" "))
				.collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));

		System.out.println(collect);
	}

}
