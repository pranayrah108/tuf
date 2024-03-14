package com.code;

import java.util.Scanner;

public class Factorial {

	public static int functionalRec(int n) {

		if (n == 0)
			return 1;
		return n * functionalRec(n - 1);
	}

	public static void parameterisedRec(int i, int fact) {

		if (i < 1) {
			System.out.println(fact);
			return;
		}
		parameterisedRec(i - 1, fact * i);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int ans = functionalRec(N);
		System.out.println("functionalRec : " + ans);
		
		parameterisedRec(5, 1);

	}

}
