package com.code;

public class secondSmallestElement {

	public static int secondSmallest(int[] arr) {
		int smallest = arr[0];
		int ssmalest = Integer.MAX_VALUE;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < smallest) {
				ssmalest = smallest;
				smallest = arr[i];
			} else if (arr[i] != smallest && arr[i] < ssmalest) {
				ssmalest = arr[i];
			}
		}
		return ssmalest;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 7, 7, 5, 99, 999, 56, 999, 999 };

		int secondSmallest = secondSmallest(arr);
		System.out.println("Second Smallest Element : " + secondSmallest);

	}

}
