package com.code.basic;

public class LinearSearch {

	public static int linearSerch(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return i;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int[] arr = { 6, 7, 8, 4, 1 };

		int ans = linearSerch(arr, 8);
		System.out.println(ans);

	}

}
