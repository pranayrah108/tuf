package com.code.easy;

public class MissingNumberInArray {
	// Brute--->Better---->Optimal

	public static int bruteSolution(int[] arr, int N) {
		int i;
		for (i = 1; i <= N; i++) {
			boolean flag = false;
			for (int j = 0; j <= arr.length - 1; j++) {
				if (arr[j] == i) {
					flag = true;
					break;
				}
			}

			if (flag == false) {
				return i;
			}

		}
		return i;

	}

	public static int optimalSolution1(int[] arr, int N) {

		int sum = N * (N + 1) / 2;
		int s2 = 0;
		for (int i = 0; i < arr.length; i++) {
			s2 += arr[i];
		}

		return sum - s2;
	}

	public static int optimalSolution2(int[] arr, int N) {
		//XOR//incomplete
		return N;

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 5 };
		int ans = bruteSolution(arr, 5);
		int ans2 = optimalSolution1(arr, 5);
		System.out.println("Brute Solution: missing number is : " + ans);
		System.out.println("Optimal Solution1 Solution: missing number is : " + ans2);

	}

}
