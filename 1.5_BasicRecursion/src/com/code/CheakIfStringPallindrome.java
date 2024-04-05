package com.code;

public class CheakIfStringPallindrome {

	public static boolean pallindrome(int i, String s) {

		if (i >= s.length() / 2)
			return true;

		if (s.charAt(i) != s.charAt(s.length() - i - 1))
			return false;

		return pallindrome(i + 1, s);
	}

	public static void main(String[] args) {

		String s = "madam";
		System.out.println(s.length());
		System.out.println(s.charAt(4));
		System.out.println(pallindrome(0, s));

	}

}
