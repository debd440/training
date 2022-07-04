package com.deb.ds.leetcode.integers;

public class PowerTest {

	// Tricky Solution
	// Leetcode 50 - https://leetcode.com/problems/powx-n/

	public static void main(String[] args) {

		System.out.println("Test 1: " + myPow(2.0, 10));
		System.out.println("Test 2: " + myPow(2.10, 3));
		System.out.println("Test 1: " + myPow(2.0, -2));
	}

	public static double myPow(double x, long num) {

		double answer = 1;
		// 2^17=2(2^8+1)
		long n = Math.abs(num);
		while (n > 0) {
			if (n % 2 == 0) {
				x = x * x;
				n = n / 2;
			} else {
				if (num > 0)
					answer = answer * x;
				else
					answer = answer / x;
				n = n - 1;
			}
		}
		return answer;
	}
}
