package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q5 {
	public static void main(String[] args) {
		// find the no which are start from 1
		List<Integer> l = Arrays.asList(10, 14, 76, 21, 17);

		List<String> collect = l.stream().map(x -> x + "").filter(x -> x.startsWith("1")).collect(Collectors.toList());
		System.out.println(collect);
		List<Integer> collect2 = l.stream().filter(x->String.valueOf(x).startsWith("1")).collect(Collectors.toList());
		System.out.println(collect2);
	}

}
