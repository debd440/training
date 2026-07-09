package com.deb.ds.core.dp;

public class EditDistance {
	
	//Leetcode-72-https://leetcode.com/problems/edit-distance/
	public static void main(String[] args) {

	}

	public static int minDistance(String word1, String word2) {

		int m = word1.length();
		int n = word2.length();

		int[] dp = new int[n + 1];

		// Base case: converting "" to prefixes of word2
		for (int j = 0; j <= n; j++) {
			dp[j] = j;
		}

		for (int i = 1; i <= m; i++) {
			int diagonal = dp[0]; // dp[i-1][0]
			dp[0] = i;            // dp[i][0]

			for (int j = 1; j <= n; j++) {
				int temp = dp[j]; // Save dp[i-1][j]
				if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
					dp[j] = diagonal;
				} else {
					dp[j] = 1 + Math.min(
							diagonal,          // replace
							Math.min(dp[j],    // delete
									dp[j - 1])// insert
					);
				}

				diagonal = temp;
			}
		}

		return dp[n];
	}
}
