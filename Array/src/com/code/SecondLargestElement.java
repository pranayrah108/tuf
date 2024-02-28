package com.code;

public class SecondLargestElement {

//	public static void brute_better(int[] arr) {    //not working
//		int largest = arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[0] > largest) {
//				largest = arr[i];
//			}
//		}
//
//		int secondLargest = -1;
//		for (int i = 0; i < arr.length; i++) {
//
//			if ((arr[i] > secondLargest) && (arr[i] != largest)) {
//				secondLargest = arr[i];
//			}
//		}
//
//		System.out.println("second largest element = " + secondLargest);
//	}

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
		System.out.println("optimal secondLargest = "+slargest);

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 7, 7, 5,99,999,56,999,999 };
//		brute_better(arr); //not giving the proper answer
		optimalSolution(arr);

	}

}
