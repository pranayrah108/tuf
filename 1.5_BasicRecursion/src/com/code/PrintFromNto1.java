package com.code;

import java.util.Scanner;

public class PrintFromNto1 {
	// Print in terms of N--->1 N=4 4 3 2 1

	public static void f(int i, int N) {

		if (i < 1)
			return;

		System.out.print(i + " ");

		f(i - 1, N);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		f(N, N);

	}

}
