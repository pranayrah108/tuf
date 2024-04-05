package com.code;

import java.util.Scanner;

public class CheakForPrime {

	public static void cheakPrime(int num) {

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("Not Prime");
				return;
			}

		}
		System.out.println("Prime");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		cheakPrime(num);

	}

}
