package com.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Q7 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7 };
		int[] arr2 = { 2, 4, 6, 8 };

		int[] array = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();
		System.out.println(Arrays.toString(array));
	}

}
