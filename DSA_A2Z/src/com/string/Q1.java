package com.string;

/*
 *  Reverse the string using 3 different way
 *  i/p: my name is shubham 
 *  first way o/p ym eman si mahbuhs
 *  second way  o/p  shubham is name my
 *  third way o/p    mahbuhs si eman ym
 */
public class Q1 {
	public static void main(String[] args) {
		String str = "my name is shubham";
		System.out.println(str + "--original String");
		System.out.println(stringRev1(str));
		System.out.println(stringRev2(str));
		System.out.println(stringrev21(str) + "-- another solution using split method");

		System.out.println(stringRev3(str));

	}

	// using the split method of string class
	public static String stringRev1(String str) {

		int start = 0;
		int end = 0;
		char[] c = str.toCharArray();

		for (int i = 0; i < c.length; i++) {

			if (c[i] == ' ' || i == c.length - 1) {
				end = (i == c.length - 1) ? i : i - 1;
				reverseCharacter(c, start, end);
				start = i + 1;
			}
		}
		return new String(c);

	}

	// shubham is name my
	public static String stringRev2(String str) {

		char[] c = str.toCharArray();
		int start = 0;
		int end = c.length - 1;
		// reverse entire char Array
		reverseCharacter(c, start, end);
		start = 0;
		for (int i = 0; i < c.length; i++) {
			// reverse single word in char array
			if (c[i] == ' ' || i == c.length - 1) {
				end = (i == c.length - 1) ? i : i - 1;
				reverseCharacter(c, start, end);
				start = i + 1;

			}
		}
		return new String(c);

	}

	public static void reverseCharacter(char[] c, int start, int end) {
		while (start < end) {
			char temp = c[start];
			c[start] = c[end];
			c[end] = temp;
			start++;
			end--;
		}
	}

//using the split method to reverse the each word from string(shubham is name my)
	public static String stringrev21(String str) {
		String rev = "";
		String[] split = str.split(" ");

		for (int i = split.length - 1; i >= 0; i--) {
			rev += split[i];
			if (i > 0) {
				rev += " ";
			}
		}
		return rev;

	}

	// mahbuhs si eman ym
	public static String stringRev3(String str) {

		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		return rev;
	}

}
