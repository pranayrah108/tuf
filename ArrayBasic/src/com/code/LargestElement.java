package com.code;

public class LargestElement {
	//brute ----> better ----->optimal

	public static void bruteSoltion(int[] arr) {

		// insertion_sort
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		int largest = arr[arr.length - 1];

		System.out.println("brute Largest Element = " + largest);

	}

	public static void optimalSolution(int[] arr) {
		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}

		}
		System.out.println("optimal Largest Element = " + largest);
	}

	public static void main(String[] args) {

		int[] arr = { 3, 2, 1, 5, 2 };
		bruteSoltion(arr);
		optimalSolution(arr);

	}

}
