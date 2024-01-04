package com.interviewquestion;

/*
 * Create trim method to remove white from start and end of the string but not between the String
 * 
 */
public class Q9 {
	public static void main(String[] args) {
		String s = "  My name  is Shubham   ";
		System.out.println("Original String is : " + s);
		System.out.println(trim(s));
	}

	public static String trim(String s) {

		int i = 0;
		String ans = "";
		int j = s.length() - 1;
		while (s.charAt(i) == ' ') {
			i++;
		}
		while (s.charAt(j) == ' ') {
			j--;
		}
		ans = s.substring(i, ++j);

		return ans;
	}

}
