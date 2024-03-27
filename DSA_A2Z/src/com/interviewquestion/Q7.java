package com.interviewquestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q7 {

	public static void main(String[] args) {
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		List<List<String>> groupAnagrams = groupAnagrams(strs);
		System.out.println(groupAnagrams);
	}

	public static List<List<String>> groupAnagrams(String[] strs) {

		Map<String, List<String>> groupNamed = new HashMap<>();

		for (String str : strs) {
			char[] tempArray = str.toCharArray();
			Arrays.sort(tempArray);
			String sortedName = new String(tempArray);
			if (groupNamed.containsKey(sortedName)) {
//				groupNamed.get(sortedName).add(str);
				

			} else {
				List<String> anagramGroup = new ArrayList<>();
				anagramGroup.add(str);
				groupNamed.put(sortedName, anagramGroup);

			}
		}
		return new ArrayList<>(groupNamed.values());

	}
}
