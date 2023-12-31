package com.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Leetcode 49 group of anagram
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
   Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 */
public class Q4 {

	public static void main(String[] args) {
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		List<List<String>> groupAnagrams = groupAnagrams(strs);
		List<List<String>> groupAnagrams1 = groupAnagrams1(strs);
		System.out.println(groupAnagrams);
		System.out.println(groupAnagrams1);
	}

	public static List<List<String>> groupAnagrams(String[] strs) {

		Map<String, List<String>> anagramMap = new HashMap<>();
		for (String str : strs) {
			char[] tempChar = str.toCharArray();
			Arrays.sort(tempChar);
			String sortedName = new String(tempChar);
			if (anagramMap.containsKey(sortedName)) {
				anagramMap.get(sortedName).add(str);

			} else {
				ArrayList<String> anagarList = new ArrayList<>();
				anagarList.add(str);
				anagramMap.put(sortedName, anagarList);
			}

		}
		return new ArrayList<>(anagramMap.values());
	}

	public static List<List<String>> groupAnagrams1(String[] strs) {

		if (strs == null || strs.length == 0) {
			return new ArrayList<>();
		}
		Map<String, List<String>> anagramMap = new HashMap<>();
		for (String str : strs) {
			char[] tempArray = new char[26];
			for (char c : str.toCharArray()) {
				tempArray[c - 'a']++;
			}
			String uniqueKey = String.valueOf(tempArray);
			if (!anagramMap.containsKey(uniqueKey)) {
				anagramMap.put(uniqueKey, new ArrayList<>());
			}
			anagramMap.get(uniqueKey).add(str);
		}
		return new ArrayList<>(anagramMap.values());

	}

}
