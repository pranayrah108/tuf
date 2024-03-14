package com.code.basic;

public class CheakIfArraySorted {

	public static boolean isSorted(int[] arr) {

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < arr[i - 1]) {
				return false;
			}

		}
		return true;

	}

	public static void main(String[] args) {

		int[] arr = { 1, 3, 5, 7, 99, 111 };
		boolean ans = isSorted(arr);
		System.out.println(ans);

		int[] arr1 = { 1, 100, 50, 7, 99, 111 };
		boolean ans1 = isSorted(arr1);
		System.out.println(ans1);

	}

}
