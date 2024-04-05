package com.code;

import java.util.Scanner;

public class PrintLinearly1toNbyBacktracking {

	public static void f(int i, int N) {
		if (i < 1)
			return;

		f(i - 1, N);

		System.out.print(i + " ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		f(N, N);

	}

}
