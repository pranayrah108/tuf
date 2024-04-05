package com.code;

import java.util.Scanner;

public class SumOfFirstNNumbers {

	public static void parameterisedRec(int i, int sum) {

		if (i < 1) {
			System.out.println(sum);
			return;
		}
		parameterisedRec(i - 1, sum + i);

	}

	public static int functionalRec(int n) {
		if (n == 0)
			return 0;
		return n + functionalRec(n - 1);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		parameterisedRec(N, 0);

		int ans = functionalRec(N);
		System.out.println("functionalRec : " + ans);

	}

}
