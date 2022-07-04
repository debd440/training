package com.deb.ds.leetcode.integers;

public class FactorialTrailingZeroes {

	// Tricky Solution
	// Leetcode 172- https://leetcode.com/problems/factorial-trailing-zeroes/

	public static void main(String[] args) {
		System.out.println(trailingZeroes(5));
	}

	public static int trailingZeroes(int n) {

		// Check if n divisable by 5. Cause 5*2=10 generate trailing zeros
		int counter = 0;
		while (n > 0) {
			n = n / 5;
			counter += n;
		}
		return counter;
	}
}
