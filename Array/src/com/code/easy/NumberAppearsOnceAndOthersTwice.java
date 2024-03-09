package com.code.easy;

public class NumberAppearsOnceAndOthersTwice {

	public static int bruteSolution(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			int count = 0;

			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == num)
					count++;
			}

			if (count == 1)
				return num;

		}

		return -1;

	}

	public static int betterSolution(int[] arr) {
		return 0;

	}

	public static void optimalSolution(int[] arr) {
		int xor = 0;
		for (int i = 0; i < arr.length; i++) {
			xor = xor ^ arr[i];
//			System.out.println( xor = xor ^ arr[i]);
			System.out.println("xor = " + xor + " ^ " + arr[i] + " = " + xor);
			
		}
//		return xor;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 3, 3, 4, 4 };
		int ans = bruteSolution(arr);
		//System.out.println(ans);
		
		optimalSolution(arr);

	}

}
