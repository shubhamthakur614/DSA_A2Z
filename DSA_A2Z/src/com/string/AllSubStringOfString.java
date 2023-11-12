package com.string;

// find all substring of given string
// i/p str="abcd"
/* o/p: 
   a
 * ab
 * abc
 * abcd
 * b
 * bc
 * bcd
 * c
 * cd
 * d
 */

public class AllSubStringOfString {
	public static void main(String[] args) {

		String s = "abcd";
		// find substring using substring method
//		subString(s);
//		subString2(s);
		subString3(s);
	}

	// using substring how we can do this
	public static void subString(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				System.out.println(s.substring(i, j));
			}
		}
	}

	// if you don't allow to use substring or not allowed to use char at u can do
	// this way
	public static void subString2(String s) {

		char[] str = s.toCharArray();
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j <= str.length; j++) {
				printString(i, j, str);
				// after printing each character space is require
				System.out.println();
			}
		}
	}

	// print the substring
	public static void printString(int start, int end, char[] str) {

		for (int i = start; i < end; i++) {
			System.out.print(str[i]);
		}
	}

	// using simple way just iterate and concate after printing
	public static void subString3(String s) {
		for (int i = 0; i < s.length(); i++) {
			String subStr = "";
			for (int j = i; j < s.length(); j++) {
				subStr += s.charAt(j);
				System.out.println(subStr);
			}
		}
	}
}
