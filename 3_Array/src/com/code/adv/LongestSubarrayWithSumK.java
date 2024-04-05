package com.code.adv;

public class LongestSubarrayWithSumK {

	private static int bruteSolution(int[] arr, long k) {

		int n = arr.length;

		int len = 0;

		for (int i = 0; i < n; i++) {
			long s = 0;
			for (int j = i; j < n; j++) {

				s += arr[j];

				if (s == k)
					len = Math.max(len, j - i + 1);
			}
		}
		return len;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 3, 5, 1, 9,8,1,1,1,1,1,1,1,1,1,1 };
		long k = 10;
		int len = bruteSolution(arr, k);
		System.out.println("The length of the longest subarray is: " + len);
	}

}
