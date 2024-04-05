package com.code.easy;

import java.util.ArrayList;

public class MoveZerosToEnd {

	public static int[] bruteSolution(int n, int[] a) {
		ArrayList<Integer> temp = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			if (a[i] != 0)
				temp.add(a[i]);
		}

		int nz = temp.size();

		for (int i = 0; i < nz; i++) {
			a[i] = temp.get(i);
		}

		for (int i = nz; i < n; i++) {
			a[i] = 0;
		}

		return a;
	}

	public static int[] optimalSolution(int n, int[] arr) {
		int j = -1;

		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				j = i;
				break;
			}
		}

		if (j == -1)
			return arr;

		for (int i = j + 1; i < n; i++) {

			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		return arr;

	}

	public static void main(String[] args) {

		int[] arr = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };
		int n = arr.length;

		System.out.println("original arry");
		for (int i : arr) {
			System.out.print(i + " ");
		}

		System.out.println();

//		int[] ans = bruteSolution(n, arr);
//
//		for (int i : arr) {
//			System.out.print(i + " ");
//		}
		
		System.out.println();

		int[] ans1 = optimalSolution(n, arr);
		System.out.println("optimalSolution:");
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
