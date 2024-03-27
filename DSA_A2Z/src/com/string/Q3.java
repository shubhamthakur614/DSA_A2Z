package com.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Two String is anagram to each other
 * i/p s1="listen" ,s2="silent"
 * o/p true
 * Edge case if you have two same character in same string how you handle by using map
 */
public class Q3 {
	public static void main(String[] args) {
		String s1 = "silent";
		String s2 = "listen";
		System.out.println(isAnagram(s1, s2));
		System.out.println(isAnagram1(s1, s2));
		System.out.println(isAnagram3(s1, s2));

	}

	// Bruteforce Approach O(nLogN)
	public static boolean isAnagram(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();
		if (m != n)
			return false;
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);

		return Arrays.equals(a, b);
	}

	// optimal with edge case of time complexity o(N) space complexity O(N)
	public static boolean isAnagram1(String s1, String s2) {

		int m = s1.length();
		int n = s2.length();
		if (m != n)
			return false;
		Map<Character, Integer> hm = new HashMap<>();

		// in case of string s1 if element present increase the value by 1
		for (int i = 0; i < s1.length(); i++) {
			if (hm.containsKey(s1.charAt(i))) {
				hm.put(s1.charAt(i), hm.get(s1.charAt(i)) + 1);
			} else {
				hm.put(s1.charAt(i), 1);
			}
		}

		// in case of string s2 if element present reduce value by -1
		for (int i = 0; i < s2.length(); i++) {

			if (hm.containsKey(s2.charAt(i))) {

				hm.put(s2.charAt(i), hm.get(s2.charAt(i)) - 1);
			} else {
				return false;
			}
		}

		for (int i = 0; i < s1.length(); i++) {
			if (hm.get(s1.charAt(i)) >= 1) {
				return false;
			}
		}

		return true;
	}

	public static boolean isAnagram3(String s, String t) {
		int m = s.length();
		int n = t.length();

		if (m != n) {
			return false;
		}
		int[] count = new int[26];

		for (int i = 0; i < m; i++) {
			count[s.charAt(i) - 'a']++;
			count[t.charAt(i) - 'a']--;

		}
		for (int c : count) {
			if (c != 0) {
				return false;
			}
		}
		return true;

	}
}
