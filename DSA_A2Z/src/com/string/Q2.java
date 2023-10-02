package com.string;

import java.util.HashMap;
import java.util.Map;

/*
 * https://leetcode.com/problems/is-subsequence/description/
 * 392. Is Subsequence
   Solved Easy
   
	Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
	
	A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
	
	 
	
	Example 1:
	
	Input: s = "abc", t = "ahbgdc"
	Output: true
	Example 2:
	
	Input: s = "axc", t = "ahbgdc"
	Output: false
 */
public class Q2 {

	public static void main(String[] args) {
		String s = "abc";
		String t = "ahbgdc";
		System.out.println(isSubsequence(s, t));
		System.out.println(isSubsequenceMap(s, t));

	}

	public static boolean isSubsequence(String s, String t) {
		int m = s.length();
		int n = t.length();
		int i = 0, j = 0;
		while (i < m && j < n) {
			if (s.charAt(i) == t.charAt(j)) {
				i++;
			}
			j++;
		}
		return i == s.length();

	}

	public static boolean isSubsequenceMap(String s, String t) {
		Map<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < t.length(); i++) {
			if (hm.containsKey(t.charAt(i))) {
				hm.put(t.charAt(i), hm.get(t.charAt(i)) + 1);
			} else {
				hm.put(t.charAt(i), 1);
			}
		}

		for (int i = 0; i < s.length(); i++) {
			if (hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), hm.get(s.charAt(i)) - 1);
			} else {
				return false;
			}
		}
		for (int i = 0; i < s.length(); i++) {
			if (hm.get(s.charAt(i)) >= 1) {
				return false;
			}
		}

		return true;
	}
}
