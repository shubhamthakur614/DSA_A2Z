package com.array;

import java.util.ArrayList;
import java.util.List;

//pascale traingle while return list<list>
/*
 *     1
 *    1 1
 *   1 2 1
 *  1 3 3 1
 * 1 4 6 4 1   
 * 
 */
public class Q8 {
	public static void main(String[] args) {
		int n = 5;
		List<List<Integer>> pascaleTriangle = pascaleTriangle(n);
		for(List l:pascaleTriangle) {
			System.out.println(l);
		}
	}

	public static List<List<Integer>> pascaleTriangle(int n) {
		List<List<Integer>> result = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			List<Integer> rows = new ArrayList<>();
			for (int j = 0; j < i; j++) {
				if (j == 0 || j == i - 1) {
					rows.add(1);
				} else {
					rows.add(result.get(i - 2).get(j) + result.get(i - 2).get(j - 1));
				}
			}
			result.add(rows);
		}
		return result;
	}

}
