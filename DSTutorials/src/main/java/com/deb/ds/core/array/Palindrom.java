package com.deb.ds.core.array;

public class Palindrom {

	public static void main(String[] args) {
		int a[] = { 1, 2, 2, 1 };
		int b[] = { 1, 2, 3 };
		System.out.println("Example 1: " + vaidatePalindrom(a));
		System.out.println("Example 2: " + vaidatePalindrom(b));
	}

	private static boolean vaidatePalindrom(int a[]) {
		// Compare between a & a[a.length-1]
		for (int i = 0; i < a.length / 2; i++) {
			if (a[i] != a[a.length - 1 - i]) {
				return false;
			}
		}
		return true;
	}
}
