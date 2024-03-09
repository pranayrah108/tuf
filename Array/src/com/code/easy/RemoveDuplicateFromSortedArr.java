package com.code.easy;

public class RemoveDuplicateFromSortedArr {
	// 2 pointer approch
	public static int optimalSolution(int[] arr) {

		int i = 0;
		for (int j = 1; j < arr.length; j++) {
			if (arr[j] != arr[i]) {
				arr[i + 1] = arr[j];
				i++;
			}
		}
		return i + 1; // returns the no of unique values in the arrya

	}

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 2, 2, 3, 3 };
		int ans = optimalSolution(arr);
		System.out.println("No.of unique values in the array: " + ans);

	}

}
