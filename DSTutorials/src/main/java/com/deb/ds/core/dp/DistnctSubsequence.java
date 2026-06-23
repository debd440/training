package com.deb.ds.core.dp;

public class DistnctSubsequence {

    // Leetcode-115 - https://leetcode.com/problems/distinct-subsequences/
	/*
	Given two strings s and t, return the number of distinct subsequences of s which equals t.
	The test cases are generated so that the answer fits on a 32-bit signed integer.
	Input: s = "rabbbit", t = "rabbit"
	Output: 3
	Explanation: As shown below, there are 3 ways you can generate "rabbit" from s by removing any b
	 */
    public static void main(String[] args) {

        String s = "rabbbit", t = "rabbit";
        System.out.println("Result 1: " + numDistinct(s, t));
    }

	public static int numDistinct(String s, String t) {

		int m = s.length();
		int n = t.length();
		int[] store = new int[n + 1];
		store[0] = 1;

		for (int i = 1; i <= m; i++) {
			for (int j = n; j >= 1; j--) {
				if (s.charAt(i - 1) == t.charAt(j - 1)) {
					store[j] += store[j - 1];
				}
			}
		}

		return store[n];
	}
}
