package com.code;

import java.util.Scanner;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int dup = num;
		int sum = 0;

		while (num > 0) {
			int digit = num % 10;
			sum = sum + (digit * digit * digit);
			num /= 10;
		}
		if (sum == dup)
			System.out.println(sum + " " + dup + " " + "given number is armstrong number");
		else
			System.out.println(sum + " " + dup + " " + "given number is not armstrong number");

	}

}
