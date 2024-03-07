package com.code;

public class MaxConsecutiveOnes {

	public static int optimalSolution(int[] nums) {
		int maxi = 0;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count++;

			} else {
				if (count > maxi) {
					maxi = count;
				}
				count = 0;
			}
		}
		maxi = maxi > count ? maxi : count;
		return maxi;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 1, 0, 1, 1, 1 };
		int ans = optimalSolution(nums);
		System.out.println("max consecutive ones is: " + ans);

	}

}
