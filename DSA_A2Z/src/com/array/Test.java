package com.array;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		int n = 5;
		List<List<Integer>> pascale = pascale(n);
		for(List l:pascale) {
			System.out.println(l);
		}

	}

	public static List<List<Integer>> pascale(int n) {

		List<List<Integer>> result = new ArrayList();
		for (int i = 1; i <= n; i++) {
			List<Integer> row = new ArrayList<>();
			for (int j = 0; j < i; j++) {
				if (j == 0 || j == i - 1) {
					row.add(1);
				} else {
					row.add(result.get(i - 2).get(j) + result.get(i - 2).get(j - 1));
				}

			}
			result.add(row);
		}
		return result;
	}

}
