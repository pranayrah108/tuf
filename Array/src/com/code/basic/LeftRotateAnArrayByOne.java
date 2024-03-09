package com.code.basic;

public class LeftRotateAnArrayByOne {

	public static int[] rotateArray(int[] arr) {
		int temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}
		arr[arr.length - 1] = temp;
		return arr;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		int[] ans = rotateArray(arr);

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
