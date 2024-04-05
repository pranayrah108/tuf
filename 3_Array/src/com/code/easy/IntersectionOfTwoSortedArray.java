package com.code.easy;

import java.util.ArrayList;

public class IntersectionOfTwoSortedArray {

	public static ArrayList<Integer> bruteSolution(int[] A, int[] B) {

		ArrayList<Integer> ans = new ArrayList<>();

		int[] visited = new int[B.length];

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {

				if (A[i] == B[j] && visited[j] == 0) {

					ans.add(B[j]);

					visited[j] = 1;
					break;

				} else if (B[j] > A[i])
					break;
			}
		}

		return ans;

	}

	public static void main(String[] args) {

		int[] A = { 1, 2, 3, 3, 4, 5, 6, 7 };
		int[] B = { 3, 3, 4, 4, 5, 8 };

		System.out.println("Arr A:");
		for (int i : A) {
			System.out.print(i + " ");
		}

		System.out.println();

		System.out.println("Arr B:");
		for (int i : B) {
			System.out.print(i + " ");
		}

		System.out.println();

		ArrayList<Integer> ans = bruteSolution(A, B);

		System.out.println("IntersectionOfArr:");
		for (int i : ans) {
			System.out.print(i + " ");
		}

	}

}
