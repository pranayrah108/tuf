package com.code;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int revNum = 0;
		while (num != 0) {
			int digit = num % 10;
			revNum = revNum * 10 + digit;
			num = num / 10;
		}
		System.out.println(revNum);

	}

}
