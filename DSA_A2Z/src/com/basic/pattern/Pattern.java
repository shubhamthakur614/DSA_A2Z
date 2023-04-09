package com.basic.pattern;

public class Pattern {
//	printing Basic pattern
	public static void main(String[] args) {
		int n = 5;
		pattern1(n);
		System.out.println();
		pattern2(n);
		System.out.println();
		pattern3(n);
		System.out.println();
		pattern4(n);
		System.out.println();
		pattern5(n);
		System.out.println();
		pattern6(n);
		System.out.println();
		pattern7(n);
		System.out.println();
		pattern8(n);
		System.out.println();
		pattern9(n);
		System.out.println();
		pattern10(n);
		System.out.println();
		pattern11(n);
		System.out.println();
		pattern12(n);
		System.out.println();
		pattern13(n);
		System.out.println();
		pattern14(n);
		System.out.println();
		pattern15(n);
		System.out.println();
		pattern16(n);
		System.out.println();
		pattern17(n);
		System.out.println();
		pattern18(n);
		System.out.println();
		pattern19(n);
		System.out.println();
		pattern20(n);
		System.out.println();
		pattern21(n);
		System.out.println();

	}

	public static void pattern1(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void pattern2(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pattern3(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void pattern4(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern5(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(n - j + 1 + " ");
			}
			System.out.println();
		}
	}

	public static void pattern6(int n) {
		// outer loop for total no of rows
		for (int i = 0; i < n; i++) {// inner loop

			// space logic before print
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}

			// printing logic
			for (int k = 0; k < i * 2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern7(int n) {
		for (int i = 0; i < n; i++) {
			// space logic
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			// printing logic
			for (int k = 0; k < 2 * n - (i * 2 + 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern8(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void pattern9(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}

			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * n - (2 * i + 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern10(int n) {
		for (int i = 1; i <= 2 * n - 1; i++) {
			int star = i;
			if (i > n) {
				star = 2 * n - i;
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void pattern11(int n) {
		int start = 1;

		// Outer loop for the no. of rows
		for (int i = 0; i < n; i++) {

			// if the row index is even then 1 is printed first
			// in that row.
			if (i % 2 == 0)
				start = 1;

			// if odd, then the first 0 will be printed in that row.
			else
				start = 0;

			// We alternatively print 1's and 0's in each row by using
			// the inner for loop.
			for (int j = 0; j <= i; j++) {
				System.out.print(start + " ");
				start = 1 - start;
			}
			System.out.println();

		}
	}

	public static void pattern12(int n) {

		for (int i = 1; i <= n; i++) {

			for (int j = n; j >= i; j--) {
				System.out.print(" ");

			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

	public static void pattern13(int n) {
//		int space = 2 * (n - 1);
//		for (int i = 1; i <= n; i++) {
//		
//			// number
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j+" ");
//			}
//
//			// space
//			for (int k = 1; k <= space; k++) {
//				System.out.print("  ");
//
//			}
//
//			// number
//			for (int l = i; l >= 1; l--) {
//				System.out.print(l+" ");
//			}
//			
//			space -= 2;
//			System.out.println();
//			
//		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			for (int j = 1; j <= 2*(n - i); j++) {
				System.out.print("  ");
			}
			for (int j = i; j > 0; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}
	
	public static void pattern14(int n)
	{
		//floyd Triangle
		int count=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count+" ");
				count+=1;
			}
			System.out.println();
		}
	}
	
	public static void pattern15(int n)
	{
		
		for(int i=0;i<n;i++)
		{
			for(char j='A';j<'A'+i;j++)
			{
				System.out.print(j);	
			}
			System.out.println();
		}
	}
	
	public static void pattern16(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(char j='A';j<='A'+(n-i);j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void pattern17(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(int)('A'+i));
			}
			System.out.println();
		}
		
	}
	
	public static void pattern18(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print(" ");
			}
			char ch='A';
			int breakpoint=(2*i+1)/2;
			
			for(int j=1;j<=2*i+1;j++)
			{
				System.out.print(ch);
				if(j<=breakpoint)
					ch++;
				else
					ch--;
			}
			
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void pattern19(int n)
	{
		
	}
	
	public static void pattern20(int n)
	{
		
	}
	
	public static void pattern21(int n)
	{
		
	}

}
