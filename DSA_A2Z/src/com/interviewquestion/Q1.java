package com.interviewquestion;

/*
 * 
 *give string you have to capitalize first letter from each word 
 */
public class Q1 {
	public static void main(String[] args) {
		String s = "my name is shubham";
		System.out.println("Original String is : " + s);
		System.out.println(capitalizeFirstWord(s));
		System.out.println(capitalizeFirstWord2(s));

	}

	public static String capitalizeFirstWord(String s) {
		String ans = "";
		String[] split = s.split(" ");
		for (int i = 0; i < split.length; i++) {
			char capitalCharacter = upperCase(split[i].charAt(0));
			String remainingString = split[i].substring(1);
			ans += capitalCharacter + remainingString;
			if (i < split.length - 1) {
				ans += " ";
			}

		}
		return ans;
	}

	public static char upperCase(char c) {
		if (c >= 'a' && c <= 'z') {
			return (char) (c - 'a' + 'A');
		}
		return c;
	}

	public static String capitalizeFirstWord2(String s) {
		if (s == null || s.isEmpty()) {
			return s;
		}
		char[] charArray = s.toCharArray();
		boolean flag = true;
		for (int i = 0; i < charArray.length; i++) {

			if (isWhiteSpace(charArray[i])) {
				flag = true;
			}
			// After making the first character capital we will make flag false
//			so it wont go to this method it wont get capitalize
			else if (flag) {
				charArray[i] = upperCase(charArray[i]);
				flag = false;
			}
		}
		return new String(charArray);
	}

	public static boolean isWhiteSpace(char c) {

		return c == ' ' || c == '\n' || c == '\t' || c == '\r';
	}

}
