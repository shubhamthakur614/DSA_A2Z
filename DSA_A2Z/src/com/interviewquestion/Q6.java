package com.interviewquestion;

import java.util.HashMap;
import java.util.Map;

/*
 * 
 * Frequency of string 
 * i/p "geeks for geeks"
 */
public class Q6 {
	public static void main(String[] args) {
		String s = "geek for geek";
		frequency(s);

	}

	public static void frequency(String s) {

		Map<Character, Integer> hm = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			if (hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), hm.get(s.charAt(i))) + 1);
			} else {
				hm.put(s.charAt(i), 1);
			}

		}

		for (int i = 0; i < s.length(); i++) {
			if (hm.get(s.charAt(i)) > 0 && s.charAt(i) != ' ') {
				System.out.println(s.charAt(i) + " " + hm.get(s.charAt(i)));
				hm.put(s.charAt(i), 0);
			}

		}
	}

}
