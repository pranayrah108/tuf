package com.code.easy;

public class TwoSum {

	static int[] bruteSolution(int[] nums, int target) {

		int[] ans = new int[2];
		ans[0] = ans[1] = -1;

		for (int i = 0; i < nums.length; i++) {

			for (int j = i + 1; j < nums.length; j++) {

				if (i == j)
					continue;

				if (nums[i] + nums[j] == target) {
					ans[0] = i;
					ans[1] = j;
					return ans;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 6, 5, 8, 11 };

		int[] ans = bruteSolution(arr, 14);

		for (int i : ans) {
			System.out.print(i + " ");
		}

	}

}
