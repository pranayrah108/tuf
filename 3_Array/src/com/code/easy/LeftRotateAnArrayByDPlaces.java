package com.code.easy;

public class LeftRotateAnArrayByDPlaces {

	public static int[] bruteSolution(int[] arr, int n, int d) {

		d = d % n;

		int[] temp = new int[d];

		for (int i = 0; i < d; i++) {
			temp[i] = arr[i];
		}

		for (int i = d; i < n; i++) {
			arr[i - d] = arr[i];
		}

		for (int i = n - d; i < n; i++) {
			arr[i] = temp[i - (n - d)];
		}

		return arr;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;

		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		System.out.println();

		int[] ans = bruteSolution(arr, n, 4);

		for (int i : ans) {
			System.out.print(i + " ");
		}

	}

}
