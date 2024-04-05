package com.code;

public class CountDigits {

	public static int count(int n) {
		int cnt = 0;
		while (n > 0) {
			cnt = cnt + 1;
			n = n / 10;
		}
		return cnt;
	}

	public static void main(String[] args) {

		int num = 12345;
		int ans = count(num);
		System.out.println(ans);

	}

}
