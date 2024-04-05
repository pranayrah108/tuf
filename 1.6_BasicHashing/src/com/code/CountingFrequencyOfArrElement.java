package com.code;

public class CountingFrequencyOfArrElement {

	public static int basicIntCounting(int number, int[] a) {

		int count = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == number) {
				count++;
			}
		}
		return count;

	}

	public static int basicCharCounting(char ch, char[] s) {

		int count = 1;

		for (int i = 0; i < s.length; i++) {
			if (s[i] == ch) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		int[] a = { 10, 5, 10, 15, 10, 5 };
		int ans = basicIntCounting(10, a);
		System.out.println(ans);

		char[] s = { 'a', 'b', 'c', 'd', 'a', 'b', 'c', 'f', 'c' };
		int ans1 = basicCharCounting('c', s);
		System.out.println(ans1);

	}

}
