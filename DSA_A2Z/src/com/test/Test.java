package com.test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {

		String name = "geeks for geeks";
		Map<Character, Long> collect = name.chars().mapToObj(c -> (char) c).filter(c -> c != ' ')
				.collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		long count = name.chars().mapToObj(c -> (char) c).filter(c -> c == 'e').count();
		int a=123456;
		List<Integer> evenDigits = String.valueOf(a)
                .chars()                                // IntStream of character digits
                .map(c -> c - '0')                      // Convert char to int
                .filter(n -> n % 2 == 0)                // Keep even digits
                .boxed()                                // Convert IntStream to Stream<Integer>
                .collect(Collectors.toList());
		

		System.out.println(evenDigits);
		
		Map<Boolean, List<Integer>> collect2 = String.valueOf(a)
		.chars()
		.mapToObj(c->c-'0')
		.collect(Collectors.partitioningBy(x->x%2==0));
		System.out.println(collect2.get(true));
		System.out.println(collect2.get(false));
	}

}
