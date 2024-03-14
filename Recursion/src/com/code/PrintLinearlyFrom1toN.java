package com.code;

import java.util.Scanner;

public class PrintLinearlyFrom1toN {
	// Print(1-N) N=4 1 2 3 4

	public static void f(int i, int N) {
		if (i > N)
			return;

		System.out.print(i + " ");

		f(i + 1, N);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		f(1, N);

	}

}
