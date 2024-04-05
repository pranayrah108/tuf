package com.code;

public class GCDorHCF {

	public static int gcd(int a, int b) {
		while (a > 0 && b > 0) {
			if (a > b)
				a = a % b;
			else
				b = b % a;
		}
		if (a == 0)
			return b;
		return a;
	}

	public static void main(String[] args) {
		
		int ans=gcd(20,5);
		System.out.println(ans);
		

	}

}
