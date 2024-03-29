package com.searching.binarysearch;

public class Q91 {

	/*
	 * https://leetcode.com/problems/sqrtx/
	 * Input: x = 4
	   Output: 2
	   Explanation: The square root of 4 is 2, so we return 2.
	 * 
	 */
		public static void main(String[] args) {

			int x = 26;
			System.out.println(squrt(x));
		}

		public static int binarySearch(int x) {
			int s=1;
			int e=x;
			int ans=-1;
			while(s<=e)
			{
				int mid=s+(e-s)/2;
				if(mid==x/mid)
				{
					return mid;
				}
				else if(mid>x/mid)
				{
					e=mid-1;
				}
				else
				{
					ans=mid;
					s=mid+1;
				}
				
			}
			return ans;
		}

		public static int squrt(int x) {
			return binarySearch(x);
		}

	}


