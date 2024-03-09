package com.code.basic;

public class SecondLargestElement {

	public static void bruteSolution(int[] arr) {

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

		int n = arr.length;
		int secondLargest = arr[n - 1];
		for (int i = n - 2; i > 0; i--) {
			if (arr[i] != secondLargest) {
				secondLargest = arr[i];
				break;
			}
		}

		System.out.println("brute second largest element = " + secondLargest);
	}

	public static void betterSolution(int[] arr) {
		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}

		int slargest = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > slargest && arr[i] != largest)
				slargest = arr[i];
		}

		System.out.println("better second largest element = " + slargest);
	}

	public static void optimalSolution(int[] arr) {
		// sec largest = INT_MIN in case of -ve number
		int largest = arr[0];
		int slargest = -1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				slargest = largest;
				largest = arr[i];
			} else if (arr[i] < largest && arr[i] > slargest) {
				slargest = arr[i];
			}
		}
		System.out.println("optimal secondLargest = " + slargest);

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 7, 7, 5, 99, 999, 56, 999, 999 };
		bruteSolution(arr);
		betterSolution(arr);
		optimalSolution(arr);

	}

}
